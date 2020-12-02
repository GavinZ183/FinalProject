/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Goods;

import Business.Product.*;
import java.util.ArrayList;

/**
 *
 * @author TT1
 */
public class Comments {
    private ArrayList<Comment> commentList;

    public ArrayList<Comment> getCommentList() {
        if(commentList==null){
            commentList = new ArrayList<Comment>();
        }
        return commentList;
    }
    
    
}
