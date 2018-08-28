/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author mca
 */
public class JavaApplication5 {

    private static class Node{
        private Date timestamp;   
        private String data;
        private float value; //float value inside data
     String genesisReferenceNodeId;
        private String hashValue;
        private final String nodeId;
        private final int nodeNumber;
        private final Object rChild;
        private final Object lChild;
        
        public Node() {
            this.data = createData();
            lChild = null;
            rChild = null;
            timestamp = new Date();
            nodeNumber++;
            nodeId = createNodeId();
            referenceNodeId = getParentAddress(genesisNode,genesisNode);
            genesisReferenceNodeId = getGenesisNodeAddress();
            hashValue = generateHashValue();
        }

        private String generateHashValue() {
            
            return null;
        }

        private int createNodeNumber() {
            
            return 1;
        }

        private String createNodeId() {
            return String.valueOf(UUID.randomUUID());
        }

    
      

        private String createData() {
            
            Scanner sc = new Scanner(System.in);
            value = sc.nextFloat();
            StringBuilder builder = new StringBuilder();
            builder.append(nodeNumber).append(" "+data).append(nodeId);
            return builder.toString();            
            
        }

        private String getGenesisNodeAddress() {
            throw new UnsupportedOperationException("Not yet implemented");
        }

      

        
        
    }
	
	
	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
