public class DebugBox
{
   private int width;
   private int length;
   private int height;
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = width;
      this.height = width;
   }
   public void showData()
   {
      System.out.println("Width : "  + width 
                       + "\nLength: "  + length 
                       + "\nHeight: "  + height);
   }
   public double  getVolume(int width, int length, int height)
   { 
      double vol = length * width * height;
      return vol;
   }
}

