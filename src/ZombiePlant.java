public class ZombiePlant {
    private int maximumPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int initialTreatments) {
        this.maximumPotency = maxPotency;
        this.treatmentsNeeded = initialTreatments;
    }

    public int getPotency() {
        return maximumPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {
        if(treatmentsNeeded > 0) {
            return true;
        }
        return false;
    }

    public void treat(int potency) {
        if (potency <= 0) {
            return;
        }

        if (potency <= maximumPotency) {
            if (treatmentsNeeded > 0) {
                treatmentsNeeded--;
            }
        } else {
            treatmentsNeeded++;
        }
    }
}