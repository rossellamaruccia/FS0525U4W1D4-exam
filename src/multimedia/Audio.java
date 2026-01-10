package multimedia;

public class Audio extends Multimedia implements Volume, Duration {
    private int VolumeValue;
    private final int Duration;

    public Audio(String title, int volume, int  duration) {
        super(title);
        this.VolumeValue = volume;
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
    public String getDuration(){
        String DurationSign = this.getTitle() + this.getVolume();
        for(int i = 0; i < Duration; i++) {
            System.out.println(DurationSign);
        }
        return "";
    }

    @Override
    public int increaseVolume(){
        return VolumeValue++;
    }

    @Override
    public int decreaseVolume(){
        VolumeValue--;
        for(int i = 0; i < VolumeValue; i++){
            System.out.print("!");
            i++;
        }
        return VolumeValue;
    }

}
