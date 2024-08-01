import java.util.Scanner;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void Run() {
        double randomNumber = Math.random()*100;
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=======YENİ ROUND======");
                if(randomNumber > 50){
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " " + "Kalan Sağlık:" + " " + this.f2.health);
                    if (isWin()) break;
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " " + "Kalan Sağlık:" + " " + this.f1.health);
                    if (isWin()) break;
                }
                else if(randomNumber < 50){
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + " " + "Kalan Sağlık:" + " " + this.f1.health);
                    if (isWin()) break;
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + " " + "Kalan Sağlık:" + " " + this.f2.health);
                    if (isWin()) break;
                }
                else {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("İlk Hangi Dövüşçü Başlasın:"+this.f1.name+" "+this.f2.name);
                    String option = scan.nextLine();
                    if(option.equals(this.f1.name)){
                        this.f2.health = this.f1.hit(f2);
                        System.out.println(this.f2.name + " " + "Kalan Sağlık:" + " " + this.f2.health);
                        if (isWin()) break;
                        this.f1.health = this.f2.hit(f1);
                        System.out.println(this.f1.name + " " + "Kalan Sağlık:" + " " + this.f1.health);
                        if (isWin()) break;
                    }
                    else if(option.equals(this.f2.name)){
                        this.f1.health = this.f2.hit(f1);
                        System.out.println(this.f1.name + " " + "Kalan Sağlık:" + " " + this.f1.health);
                        if (isWin()) break;
                        this.f2.health = this.f1.hit(f2);
                        System.out.println(this.f2.name + " " + "Kalan Sağlık:" + " " + this.f2.health);
                        if (isWin()) break;
                    }
                    else System.out.println("Yanlış Bir Seçim yaptınız. Programı Tekrar Başlatınız...");
                }

            }
        } else System.out.println("Sporcuların Ağırlıkları Uyuşmamaktır. ");
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " " + "Kazandı!");
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " " + "Kazandı!");
        }
        return false;
    }
}
