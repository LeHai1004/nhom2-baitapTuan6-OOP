/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;

/**
 *
 * @author HOANG HAI
 */
public class QuanLySach {
    ArrayList <Sach> danhsach = new ArrayList<>();

    public void them(Sach s){
        danhsach.add(s);
    }
    public Sach timkiem(String masach){
        for(Sach s : danhsach){
            if(s.getMaSach().equalsIgnoreCase(masach)){
                return s;
            }
        }
        return null;
    }
    public void xoa(String masach){
        Sach s = timkiem(masach);
        if(s != null){
            danhsach.remove(s);
        }
        else{
            System.out.println("khong tim thay ma sach do. ");
        }
    }
    public void update(){
        
    }
    
    public void hienthidanhsach(){
        if(danhsach.isEmpty()){
            System.out.println("danh sach trong.");
        }
        else{
            for(Sach s : danhsach){
                  System.out.println(s.toString());
            }
        }
    }
}
