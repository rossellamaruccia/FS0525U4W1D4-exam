package multimedia;

public class Image extends Multimedia implements Brightness {
    private int BrightnessValue;

    public Image(String title, int brightness) {
        super(title);
        this.BrightnessValue = brightness;
    }

    @Override
    public String setBrightness(){
        StringBuilder BrightnessSigns = new StringBuilder();
        for(int j = 0; j < BrightnessValue; j++) {
            BrightnessSigns.append("*");
        }
        return BrightnessSigns.toString();
    }

    @Override
    public int increaseBrightness(){
        return BrightnessValue++;
    }

    @Override
    public int decreaseBrightness(){
        return BrightnessValue--;
    }

}
