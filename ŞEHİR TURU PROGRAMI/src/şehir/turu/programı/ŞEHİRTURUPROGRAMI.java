
package şehir.turu.programı;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ŞEHİRTURUPROGRAMI {
    
    public static void islemleri_bastir(){
        
        System.out.println("0 - islemleri goruntule ");
        System.out.println("1 - bir sonraki sehre git ");
        System.out.println("2 - bir onceki sehre git ");
        System.out.println("3 - uygulamadan cik ");

    }
    
    public static void sehirleri_turla(LinkedList<String> sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        int islem;
        
        islemleri_bastir();
        
        Scanner input = new Scanner(System.in);
        if (!iterator.hasNext()) {
            
            System.out.println("herhangi bir sehir bulunmuyor");
        }
        boolean cikis = false;
        boolean ileri = true;
        
        while(!cikis){
            System.out.println("bir islem seciniz :");
            islem = input.nextInt();
            
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri=true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("sehre gidiyor : "+iterator.next());
                    }else{
                        System.out.println("gidilcek yer kalmadi...");
                    }
                        ileri =  true;
                    break;
                case 2:
                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("sehre gidiliyor : "+iterator.previous());
                    }else{
                        System.out.println("sehir turu basladi...");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("uygulamadan cikiliyor...");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");
        
        sehirleri_turla(sehirler);
        
    }
    
}
