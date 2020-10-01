package com.study.commonlyobject;


import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-10-01 15:36
 */
public class RegexTest {
    /**
     * 定义匹配规则
     */
    private static Pattern PATTERN = Pattern.compile("[a-zA-Z0-9]{4}");
    public static void main(String[] args){
        //使用匹配器
        Matcher matcher = PATTERN.matcher("9Aa9");
        System.out.println(matcher.matches());
        //不使用匹配器
        System.out.println("fgh".matches("[a-z]{3}"));

        //初步认识 . 任意一字符; * 任意0个或多个 ; +任意一个或多个 ; ?一个或0个
        System.out.println("aa".matches("."));
        System.out.println("taab".matches(".aa."));
        System.out.println("aaaa".matches("a*"));
        System.out.println("aaaa".matches("a+"));
        //包含0到1个b
        System.out.println("ab".matches("abb?"));
        System.out.println("".matches("a?"));
        System.out.println("a".matches("a?"));
    }

    /**
     * @Description: 匹配符号[]
     * 复选集定义 [abc]; [abc][cd]; [^abc]; [a-d1-8]
     * @Param: []
     * @Return: void
     * @Author: humm
     * @Date: 2020-10-01 16:21
     */
    @Test
    public void testRegexArea(){
        System.out.println("a".matches("[abc]"));
        System.out.println("abc".matches("[abc][abc][abc]"));
        System.out.println("d".matches("[^abc]"));
        System.out.println("2".matches("[a-d1-8]"));

    }

    /**
     * @Description: 对与匹配到的元素的个数限制
     * @Param: []
     * @Return: void
     * @Author: humm
     * @version V1.0
     * @Date: 2020-10-01 16:30
     */
    @Test
    public void testRegexLimit(){
        //匹配四个空格
        System.out.println("\n \r\t".matches("\\s{4}"));
        //a 是非空格
        System.out.println("a".matches("\\S"));

    }

    /**
     * @Description:测试匹配的邮箱的正则表达式
     * @Param: []
     * @Return: void
     * @Author: humm
     * @version V1.0
     * @Date: 2020-10-01 16:35
     */
    @Test
    public void testEmailRegex() throws IOException {
        URL url = new URL("https://www.douban.com/group/topic/8845032/");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setConnectTimeout(1000*10);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line = null;
        String regex = "[a-zA-Z0-9_-]+@+\\\\w(\\\\.[a-z])+";
        Pattern pattern = Pattern.compile(regex);
        while ((line=bufferedReader.readLine())!=null){
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }

    }

    @Test
    public void test() throws IOException {
        String email = "1149178969@qq.com";
        String regex = "^[a-zA-Z0-9_-]+@+\\w+(\\.[a-z]+)+$";
        String regex2 = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
        System.out.println(email.matches(regex));
    }
}
