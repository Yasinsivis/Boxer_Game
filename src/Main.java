//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Fighter fighter1=new Fighter("A",20,100,96);
      Fighter fighter2=new Fighter("B",25,90,85);

      Match match=new Match(fighter1,fighter2,80,100);
      match.Run();
    }
}