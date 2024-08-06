class Solution {

    public boolean isValid(String str) {
        // Split the string by dots
        String[] parts = str.split("\\.");
        
        // There should be exactly 4 parts
        if (parts.length != 4) {
            return false;
        }
        
        for (String part : parts) {
            // Check if the part is a number
            if (!isNumeric(part)) {
                return false;
            }
            
            // Convert the part to an integer
            int num;
            try {
                num = Integer.parseInt(part);
            } catch (NumberFormatException e) {
                return false;
            }
            
            // Ensure the number is between 0 and 255
            if (num < 0 || num > 255) {
                return false;
            }
            
            // Ensure there are no leading zeros
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
        }
        
        return true;
    }
    
    // Helper method to check if a string is a numeric value
    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
