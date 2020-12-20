package homework.braceChecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․
    // աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error: Closed ");
                        sb.append(c);
                        sb.append(" but not opened at ");
                        sb.append(i);
                        System.err.println(sb.toString());
                    } else if ((char) stack.pop() != '{') {
                        System.err.println("Error: opened { but closed " + c + " at " + i);
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        System.err.println("Error: Closed " + c + " but not opened at " + i);
                    } else if ((char) stack.pop() != '[') {
                        System.err.println("Error: opened [ but closed " + c + " at " + i);
                    }
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        System.err.println("Error: Closed " + c + " but not opened at " + i);
                    } else if ((char) stack.pop() != '(') {
                        System.err.println("Error: opened ( but closed " + c + " at " + i);
                    }
                    break;
            }
        }

        if (!stack.isEmpty()) {
            int last;
            while ((last = stack.pop()) != 0) {
                System.err.println("Error: Opened " + (char) last + " but not closed");
            }
        }
    }
}
