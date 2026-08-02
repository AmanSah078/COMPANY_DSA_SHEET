class MajorityElement {

    static int majorityelement(int[] arr) {

        int majority = arr[0];
        int votes = 0;

        for (int i = 0; i < arr.length; i++) {

            if (votes == 0) {
                majority = arr[i];
            }

            if (arr[i] == majority) {
                votes++;
            } else {
                votes--;
            }
        }

        return majority;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 3};

        int result = majorityelement(arr);

        System.out.println(result);
    }
}