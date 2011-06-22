package it.aip.models;

import java.io.Serializable;

public class ImageFile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fileName;
    private String contentType;
    private byte[] data;
    
    public ImageFile(){
        this.fileName = null;
        this.data = null;
        this.contentType = null;
    }
    public ImageFile(String fileName, String contentType, byte[] data) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.data = data;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return this.fileName;
    }
    
    public void setData(byte[] data) {
        this.data = data;
    }
    public byte[] getData() {
        return this.data;
    }
    
    public void setContentType(String contentType){
        this.contentType = contentType;
    }
    public String getContentType(){        
        return this.contentType;
    }
    
}
