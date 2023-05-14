package week5LabTest;

public interface NumberInterface<T> {
    
    // Metadata
    int getSize();
    void setSize(int size);
// Conversions
public T fromInteger(int value);
public Integer toInteger();
// Operations
public T add(T o);
public T mul(T o);
}

    class CpuInt implements NumberInterface<CpuInt> {
    private int value;
    private int size;
    // Constructors
    public CpuInt(int value) {
        this.value = value;
    }
    
    @Override
    public int getSize() {
        return this.size;
    }
    
    @Override
    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public CpuInt fromInteger(int value) {
        return new CpuInt(value);
    }
    
    @Override
    public Integer toInteger() {
        return this.value;
    }
    
    public CpuInt add(CpuInt o) {
        System.out.printf("CPU Debug: %d + %d = %d\n", this.value,
        o.value, this.value + o.value);
        return new CpuInt(this.value + o.value);
        }
        
    public CpuInt mul(CpuInt o) {
        System.out.printf("CPU Debug: %d * %d = %d\n", this.value,
        o.value, this.value * o.value);
        return new CpuInt(this.value * o.value);
        }
    
    
    @Override
        public String toString() {
        return String.format("%s[%d]" , getDevice(), this.value);
    }
    
    public String getDevice() {
        return "CPU";
    }
    



































class GpuInt implements NumberInterface<GpuInt> {
    private int value;
    private int size;
    // Constructors
    public GpuInt(int value) {
    this.value = value;
    }
    @Override
    public int getSize() {
    return this.size;
    }
    @Override
    public void setSize(int size) {
    this.size = size;
    }
    @Override
    public GpuInt fromInteger(int value) {
    return new GpuInt(value);
    }
    @Override
    public Integer toInteger() {
    return this.value;
    }
    @Override
    public String toString() {
    return String.format("%s[%d]" , getDevice(), this.value);
    }

        public String getDevice() {
    return "GPU";
    }

    public GpuInt add(GpuInt o) {
    System.out.printf("GPU Debug: %d + %d = %d\n", this.value,
    o.value, this.value + o.value);
    return new GpuInt(this.value + o.value);
    }

    public GpuInt mul(GpuInt o) {
    System.out.printf("GPU Debug: %d * %d = %d\n", this.value,
    o.value, this.value * o.value);
    return new GpuInt(this.value * o.value);
    }
}
}
    