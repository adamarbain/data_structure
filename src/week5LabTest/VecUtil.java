package week5LabTest;

import java.util.ArrayList;

import week5LabTest.CpuInt.GpuInt;
import week5LabTest.CpuInt;

public class VecUtil {
    
    // Vector Constructors
    public static ArrayList<CpuInt> arr2vec(int[] arr) {
        ArrayList<CpuInt> vec = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            vec.add(new CpuInt(arr[i]));
        }
        return vec;
    }

    public static ArrayList<GpuInt> arr2vec(int[] arr, GpuIntFactory factory) {
        ArrayList<GpuInt> vec = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            vec.add(factory.fromInteger(arr[i]));
        }
        return vec;
    }

    public static ArrayList<CpuInt> ones(int length) {
        ArrayList<CpuInt> vec = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            vec.add(new CpuInt(1));
        }
        return vec;
    }

    public static ArrayList<GpuInt> ones(int length, GpuIntFactory factory) {
        ArrayList<GpuInt> vec = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            vec.add(factory.fromInteger(1));
        }
        return vec;
    }

    // Printing Utility
    public static <T extends NumberInterface> void printVec(ArrayList<T> vec) {
        StringBuilder sb = new StringBuilder("[");
        for (T elem : vec) {
            sb.append(elem.toString()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()).append("]");
        System.out.println(sb.toString());
    }

    public static <T extends NumberInterface> ArrayList<T> elementWiseMul(ArrayList<T> vec1, ArrayList<T> vec2) {
        ArrayList<T> result = new ArrayList<>();
        int size = vec1.size();
        for (int i = 0; i < size; i++) {
            result.add(vec1.get(i).mul(vec2.get(i)));
        }
        return result;
    }
    
    public static <T extends NumberInterface> ArrayList<T> scalarMul(ArrayList<T> vec, T scalar) {
        ArrayList<T> result = new ArrayList<>();
        int size = vec.size();
        for (int i = 0; i < size; i++) {
            result.add(vec.get(i).mul(scalar));
        }
        return result;
    }

    public static <T extends NumberInterface> T dot(List<T> vec1, List<T> vec2) {
        if (vec1.size() != vec2.size()) {
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        
        T result = vec1.get(0).mul(vec2.get(0)).fromInteger(0);
        
        for (int i = 0; i < vec1.size(); i++) {
            result = result.add(vec1.get(i).mul(vec2.get(i)));
        }
        
        return result;
    }
    
}
