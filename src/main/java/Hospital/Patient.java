package Hospital;

public class Patient {

    private int healthLvl;
    private int bloodLvl;


    public int getHealthLvl() {
        return healthLvl;
    }

    public int getBloodLvl() {
        return bloodLvl;
    }

    public Patient() {
        healthLvl = 10;
        bloodLvl = 20;
    }

    public Patient(int healthLvl, int bloodLvl){
        this.bloodLvl = healthLvl;
        this.bloodLvl = bloodLvl;
    }

    public void increaseHealthLevel(int healthIncreaseAmnt) {
        healthLvl += healthIncreaseAmnt;
    }

    public void drawBlood(int bloodDrawAmnt) {
        bloodLvl -= bloodDrawAmnt;
    }
}
