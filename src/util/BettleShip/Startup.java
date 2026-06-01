package util.BettleShip;
import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    //int private de numOfHits

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourSelf(String userInput){
        String result = "miss";

        int index = locationCells.indexOf(userInput); //verifica o palpite do usuário está no arraylist,se não, retorna -1

        if(index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){ //se a lista estiver vazia,a startup foi eliminada
                result = "kill";
            } else {
                result = "hit";
            }
        }

        return result;
    }

}
