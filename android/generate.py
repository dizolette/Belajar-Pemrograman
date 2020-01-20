
import numpy as np2
import pandas as pd
import re
import nltk
import matplotlib.pyplot as plt
nltk.download('stopwords')
nltk.download('wordnet')

from scipy.sparse import coo_matrix
from nltk.corpus import stopwords
from nltk.stem.porter import PorterStemmer
from nltk.tokenize import RegexpTokenizer
from nltk.stem.wordnet import WordNetLemmatizer
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.feature_extraction.text import TfidfTransformer
from sklearn.model_selection import train_test_split
from nltk.tokenize import sent_tokenize
from nltk.tokenize import word_tokenize

lem = WordNetLemmatizer()
ps = PorterStemmer()

listStopWordIndo = set(stopwords.words('indonesian'))
listStopWordEng = set(stopwords.words('english'))
listStopWordCustom = listStopWordEng.union(['general', 'etc','in'])
combine_stop = listStopWordIndo.union(listStopWordCustom)

# path = "/content/drive/My Drive/Skripsi/data/article_new_latest.csv"

data = pd.read_csv("article_new_latest.csv", usecols=['c_article_id','title','abstract','keyword','year','subject']).drop_duplicates(keep='first').reset_index(drop=True)
print(data.head())

def topic_discovery(doc):
    processed_topic = []
    print("keyword:", doc)
    doc = doc.lower()
    topics = re.sub(r'[^A-Za-z,.;]', ' ', doc)
    topics = re.split(r'[,.;] ',topics)
    
    for x in topics:
        x = re.sub(r'[,.;]', '', x)
        x = x.strip()
        x = x.split()

        x = [ps.stem(word) for word in x if word not in combine_stop]
        x = " ".join(x)
        x = x.strip()
        
        if (x != ''):
            processed_topic.append(x)
        processed_topic = list(dict.fromkeys(processed_topic))

    return processed_topic


def cleaning_input(topic):
    topics = re.sub(r'[^A-Za-z,.;]', ' ', topic)
    topics = topics.strip().lower()
    topics = topics.split()
    #   for subWord in topics:
    #     subWord = ps.stem(subWord)
    #     subWord = " ".join(subWord)
    #     subWord = subWord.strip()
    topics = [ps.stem(subWord) for subWord in topics]
    out_topic = topics[0]
    if len(topics)>1:
        out_topic =""
        for x in range(len(topics)):
            out_topic = out_topic + topics[x] + " "
        out_topic = out_topic.strip()
        out_topic = out_topic.replace(' ','_')

    #   for x in topics:
    #     x = ps.stem(x)
    #     x = " ".join(x)
    #     x = x.strip()
    return out_topic

def generate_in_matrix(data):
    topic_incidence_matrix = {}
    topics = []
    year = data.year
    year_list = data.year.unique()
    keyword = data.keyword

    for i in range(len(data)):
        topic_doc = topic_discovery(keyword[i])
#     topic_per_year = {}
#     topic_per_year[str(year[i])][i] = {}
    
        for tp in topic_doc:
            topic = tp.replace(' ','_')
        
            if topic not in topics:
                topics.append(topic)
                topic_incidence_matrix[topic] = {}
                for y_l in year_list:
                    topic_incidence_matrix[topic][str(y_l)] = 0

            topic_incidence_matrix[topic][str(year[i])] = topic_incidence_matrix[topic][str(year[i])] + 1
        
    topic_incidence_matrix[topic] = dict(sorted(topic_incidence_matrix[topic].items()))
    return topic_incidence_matrix, topics


# testing = "underpricing fluctuation"
# testing2 = "book building mechanics "
# a = cleaning_input(testing)
# b = cleaning_input(testing2)
# print("nilai a: ",a)
# print("nilai b: ",b)

t_i_m, topikk = generate_in_matrix(data)
print("TIM :", t_i_m)
print("Out Topic: ", topikk)

dataframe = pd.DataFrame.from_dict(t_i_m)
print(dataframe)
transformDF = dataframe.T
transformDF.to_csv("testing_output3.csv")