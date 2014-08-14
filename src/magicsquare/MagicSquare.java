/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package magicsquare;

/**
 *
 * @author yoshida
 */
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] sq_num = new int[9];   //９マスに数字を格納（左上から０〜８とする）
        boolean[] flag = new boolean[10]; //ループ処理管理フラグ

        //1つ目の数字を選ぶ    
        for(int n1=1; n1<10; n1++){
            if(flag[n1]) continue;
            sq_num[0] = n1;
            flag[n1] = true;
            //2つ目の数字を選ぶ    
            for(int n2=1; n2<10; n2++){
                if(flag[n2]) continue;
                sq_num[1] = n2;
                flag[n2] = true;
                //3つ目の数字を選ぶ    
                for(int n3=1; n3<10; n3++){
                    if(flag[n3]) continue;
                    sq_num[2] = n3;
                    flag[n3] = true;
                    //4つ目の数字を選ぶ    
                    for(int n4=1; n4<10; n4++){
                        if(flag[n4]) continue;
                        sq_num[3] = n4;
                        flag[n4] = true;
                        //5つ目の数字を選ぶ    
                        for(int n5=1; n5<10; n5++){
                            if(flag[n5]) continue;
                            sq_num[4] = n5;
                            flag[n5] = true;
                            //6つ目の数字を選ぶ    
                            for(int n6=1; n6<10; n6++){
                                if(flag[n6]) continue;
                                sq_num[5] = n6;
                                flag[n6] = true;
                                //7つ目の数字を選ぶ    
                                for(int n7=1; n7<10; n7++){
                                    if(flag[n7]) continue;
                                    sq_num[6] = n7;
                                    flag[n7] = true;
                                    //8つ目の数字を選ぶ    
                                    for(int n8=1; n8<10; n8++){
                                        if(flag[n8]) continue;
                                        sq_num[7] = n8;
                                        flag[n8] = true;
                                        //9つ目の数字を選ぶ    
                                        for(int n9=1; n9<10; n9++){
                                            if(flag[n9]) continue;
                                            sq_num[8] = n9;
                                            flag[n9] = true;
                                            //順列を出力
                                            for(int n: sq_num){
                                                System.out.print(n + "");
                                            }
                                            //和が等しいか場合は文字を追加
                                            if(sum(sq_num)){
                                                System.out.print("：解");
                                            }
                                            System.out.println();
                                            flag[n9] = false;
                                        }
                                        flag[n8] = false;
                                    }
                                    flag[n7] = false;
                                }
                                flag[n6] = false;
                            }
                            flag[n5] = false;
                        }
                        flag[n4] = false;
                    }
                    flag[n3] = false;
                }
                flag[n2] = false;
            }
            flag[n1] = false;
        }
    }
    
    //行、列、対角線の和が等しいかチェックする//
    static boolean sum(int num[]){
        int[] sum = new int[8];
        boolean res = true;
        
        sum[0] = num[0]+num[1]+num[2]; //１行目
        sum[1] = num[3]+num[4]+num[5]; //２行目
        sum[2] = num[6]+num[7]+num[8]; //３行目
        sum[3] = num[0]+num[3]+num[6]; //１列目
        sum[4] = num[1]+num[4]+num[7]; //２列目
        sum[5] = num[2]+num[5]+num[8]; //３列目
        sum[6] = num[0]+num[4]+num[8]; //対角線１
        sum[7] = num[2]+num[4]+num[6]; //対角線２
    
        //和が等しいかチェックS
        for(int i=1; i<7; i++){
            if(sum[0]!=sum[i])
                res = false;
        }
        return res;
    }
}
