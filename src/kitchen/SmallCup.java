package kitchen;
//TODO Când un „mostenitor” din ierarhia OOP „nu este de acord” cu logica/structura care i-a fost transmisă, acesta o suprascrie. Rezultă astfel o nouă „opțiune” de logică/structură la nivel de copil! - Polimorfism!
//Să presupunem că aveți o clasă „cana mică”, SmallCup, în același pachet ca și Cup, care moștenește totul de la „Cup”:
//adăugați cod in loc de ??? atunci când declarați clasa mostenitoare
//redefiniti comportamentul setter-ului pentru volumul de lichid din interior astfel încât să vă permită doar setarea intervalului 0..250 ml
//creați 1 cana mică de ceai (200 ml) afișați informații despre aceasta!
//declară clasa BigCup - succesorul Cup, după aceleași principii ca și SmallCup, suprascrieti doar setter-ul pentru volumul cu un interval de 0..1000 ml
//creați o cană mare în main() unde există deja 200 ml de apă, turnați toată apa rămasă din cupB (part1) în această cană mare, afișați informațiile pe ecran!
//NOTĂ - doar 1 metodă ar trebui redefinită în codul clasei „SmallCup”!!!



public class SmallCup extends Cupp {
    public SmallCup() {}
    public SmallCup(String liquidName,double liquidVolume){
        super(liquidName,liquidVolume);
    }
    public void setLiquidVolume (double liquidVolume){
        if(liquidVolume < 0||liquidVolume > 250){
            throw new IllegalArgumentException("Volume must be between 0 and 250");
        }else {
            super.setLiquidVolume(liquidVolume);
        }
    }

}
