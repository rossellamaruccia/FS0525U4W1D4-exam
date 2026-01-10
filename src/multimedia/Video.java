package multimedia;

public class Video extends Multimedia implements Volume, Brightness, Duration {
    private int VolumeValue;
    private int BrightnessValue;
    private final int Duration;

    public Video(String title, int volume,  int brightness, int duration) {
        super(title);
        this.VolumeValue = volume;
        this.BrightnessValue = brightness;
        this.Duration = duration;
    }

    @Override
    public String getVolume(){
        StringBuilder VolumeSigns = new StringBuilder();
        for(int i = 0; i < VolumeValue; i++) {
            VolumeSigns.append("!");
        }
        return VolumeSigns.toString();
    }

    @Override
    public String play(){
        String DurationSign = this.getTitle() + this.getVolume() + this.setBrightness();
       for(int i = 0; i < Duration; i++) {
       System.out.println(DurationSign);
       }
        return "";
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
    public int increaseVolume(){
        return VolumeValue++;
    }

    @Override
    public int increaseBrightness(){
       return BrightnessValue++;
    }

    @Override
    public int decreaseVolume(){
        return VolumeValue--;
    }

    @Override
    public int decreaseBrightness(){
        return BrightnessValue--;
    }
}
