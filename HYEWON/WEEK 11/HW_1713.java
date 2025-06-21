import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Student implements Comparable<Student> {
    int number;
    int cnt;
    int time;

    public Student(int number, int cnt, int time){
        this.number = number;
        this.cnt = cnt;
        this.time = time;
    }

    @Override
    public int compareTo(Student s1){
        if (this.cnt != s1.cnt) {
            return this.cnt - s1.cnt; // 추천 수 오름차순
        }
        return this.time - s1.time; // 오래된 시간 우선
    }
}

class HW_1713{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 사진 틀의 개수
        int number = Integer.parseInt(br.readLine());

        List<Student> photos = new ArrayList<>();
        Student[] students = new Student[101];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<number; i++){
            int num = Integer.parseInt(st.nextToken());

            if(students[num]!=null){
                students[num].cnt++;
            } else{
                Collections.sort(photos);
                if(photos.size() == N){
                    Student del = photos.remove(0);
                    students[del.number] = null;
                }
                students[num] = new Student(num, 1, i);
                photos.add(students[num]);
            }
        }
        Collections.sort(photos, (o1, o2) -> o1.number - o2.number);
        for(Student s : photos){
            System.out.print(s.number + " ");
        }

    }
}