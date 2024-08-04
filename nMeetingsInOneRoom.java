import java.util.Arrays;
import java.util.Comparator;

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // Create an array of meetings
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }
        
        // Sort the meetings based on their end time
        Arrays.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.end - m2.end;
            }
        });
        
        // Initialize the count of meetings and the end time of the last meeting
        int count = 0;
        int lastEndTime = 0;
        
        // Iterate over the sorted meetings and select the ones that can be accommodated
        for (Meeting meeting : meetings) {
            if (meeting.start > lastEndTime) {
                count++;
                lastEndTime = meeting.end;
            }
        }
        
        return count;
    }
    
    // Meeting class to hold start and end time
    class Meeting {
        int start;
        int end;
        
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
