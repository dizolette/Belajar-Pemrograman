#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    //deklarasi variabel
    int a=1, b=1, optMenu, tabungan = 0, nominal=0, noTujuan = 0;
    char uname[5], pswd[5];

    while(a == 1){
        printf("\n ---------- APLIKASI BANK ----------");
        printf("\n Username :");
        scanf("%s",&uname);
        printf("\n Password :");
        scanf("%s",&pswd);
        printf("\n -----------------------------------");
            if ( (strcmp(uname,"admin")==0) && (strcmp(pswd,"12345")==0) ) {
                printf("\n INFO: Login Berhasil.\n \n");
                a = 0;
            } else {
                printf("\n INFO: Login Gagal. username dan password tidak sesuai. \n \n");
            }
        system("pause");
        system("cls");
    }

    while (b == 1) {
        printf("\n -------------- MENU ---------------");
        printf("\n 1. Penyetoran");
        printf("\n 2. Penarikan");
        printf("\n 3. Cek Saldo");
        printf("\n 4. Transaksi");
        printf("\n 5. Keluar");
        printf("\n -----------------------------------");
        printf("\n masukan pilihan(1-5) : ");
        scanf("%d",&optMenu);

        switch(optMenu){
            case 1:
                printf("\n ----------- PENYETORAN -----------");
                printf("\n Masukkan nominal yang diinginkan :");
                scanf("%d",&nominal);
                tabungan = tabungan + nominal;
                printf("\n INFO: Penyetoran Berhasil \n \n");
                printf("\n -----------------------------------\n");
            break;

            case 2:
                printf("\n ------------ PENARIKAN ------------");
                printf("\n Masukkan nominal yang diinginkan :");
                scanf("%d",&nominal);
                tabungan = tabungan - nominal;
                printf("\n INFO: Penarikan Berhasil \n \n");
                printf("\n -----------------------------------\n");
            break;

            case 3:
                printf("\n ------------ CEK SALDO ------------");
                printf("\n Saldo Anda : %d,-",tabungan);
                printf("\n ----------------------------------- \n \n");
            break;

            case 4:
                printf("\n ------------ TRANSAKSI ------------");
                printf("\n Masukan nomor tujuan :");
                scanf("%d", &noTujuan);
                printf("\n Masukan nominal:");
                scanf("%d", &nominal);

                if(tabungan <= nominal){
                    printf("\n INFO: Saldo tidak mencukupi. \n");
                } else {
                    tabungan = tabungan - nominal;
                    printf("\n INFO: pengiriman ke nomor %d, sebesar %d Berhasil.", (noTujuan), (nominal));
                }
                printf("\n ----------------------------------- \n \n");
            break;

            case 5:
                printf("\n ---------- TERIMA KASIH -----------");
                exit(0);
            break;

            default:
                printf("\n Input yang anda masukan tidak terdaftar \n");
            break;
        }
        system("pause");
        system("cls");
    }
}
