package ListNodeLeetCode;

import java.util.ArrayList;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ///// - vars

        ArrayList<Integer> l1ArrList = new ArrayList<>();
        ArrayList<Integer> l2ArrList = new ArrayList<>();

        ListNode n1 = l1;
        ListNode n2 = l2;

        ArrayList<Integer> sumList = new ArrayList<>();

        ///// - transform LL to ArrList

        l1ArrList = createArrListCopy(l1ArrList,n1);
        l2ArrList = createArrListCopy(l2ArrList, n2);

        ///// - sum reverse lists

        if(l1ArrList.size() < l2ArrList.size()) {

            sumList = sumListsDifSize(l1ArrList, l2ArrList);

        } else if (l2ArrList.size() < l1ArrList.size()) {

            sumList = sumListsDifSize(l2ArrList, l1ArrList);

        } else {

            SumListResults newSumListResults = sumListSameSize(l1ArrList, l2ArrList, true);
            ArrayList<Integer> resultsList = newSumListResults.sumList;
            return arrayListConverter(resultsList);

        }

        ///// - create output LL

        return arrayListConverter(sumList);

    }


    //////////////////////////////////////////////////////////////////////////////// -- helpers


    private ArrayList<Integer> createArrListCopy (ArrayList<Integer> arrList, ListNode pointer){

        while (pointer != null) {
            arrList.add(pointer.val);
            pointer = pointer.next;
        }

        return arrList;
    }


    private SumListResults sumListSameSize(ArrayList<Integer> arr1, ArrayList<Integer> arr2, Boolean sameSize) {

        ArrayList<Integer> sumList = new ArrayList<>();

        int carryTheOne = 0;
        for (int i = 0; i < arr1.size(); i++) {

            int currentSum = arr1.get(i) + arr2.get(i);

            if(carryTheOne == 1){
                currentSum++;
                carryTheOne--;
            }

            if (currentSum >= 10) {
                currentSum %= 10;
                carryTheOne++;
            }

            sumList.add(currentSum);
        }

        if (carryTheOne == 1 && sameSize){
            sumList.add(1);
            carryTheOne--;
        }

        return new SumListResults(sumList, sameSize, carryTheOne);

    }

    private ArrayList<Integer> sumListsDifSize(ArrayList<Integer> smallerList, ArrayList<Integer> largerList){

        SumListResults sumListResult = sumListSameSize(smallerList, largerList, false);
        ArrayList<Integer> sumList = sumListResult.sumList;

        int continueCarryingOne = sumListResult.remainder;
        for (int i = smallerList.size(); i < largerList.size(); i++){

            int currentDigit = largerList.get(i);

            if(continueCarryingOne > 0){
                currentDigit++;
                continueCarryingOne--;
            }

            if (currentDigit >= 10) {
                currentDigit %= 10;
                continueCarryingOne++;
            }

            sumList.add(currentDigit);
        }

        if (continueCarryingOne == 1){
            sumList.add(1);
        }

        return sumList;
    }

    private ListNode arrayListConverter(ArrayList<Integer> sumList) {

        ListNode outputList = new ListNode(sumList.get(0));
        ListNode pointer = outputList;

        if(sumList.size() > 1) {
            for (int i = 1; i < sumList.size(); i++) {
                pointer.next = new ListNode(sumList.get(i));
                pointer = pointer.next;
            }
        }

        return outputList;
    }

    private class SumListResults {
        ArrayList<Integer> sumList;
        Boolean carryTheOneTrue;
        int remainder;

        SumListResults(ArrayList<Integer> sumList, Boolean isTrue, int remainder){
            this.sumList = sumList;
            this.carryTheOneTrue = isTrue;
            this.remainder = remainder;
        }
    }
}
