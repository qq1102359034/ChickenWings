package com.cnki.chickenwingsweb.dao.system.book;

import com.cnki.chickenwingsweb.dao.simple.DepartmentDao;
import com.cnki.chickenwingsweb.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BookDao {
    private static Map<Integer, Books> map = null;

    static{
        map = new HashMap<Integer, Books>();
/*
1	第01章 天涯思君不可忘	《倚天屠龙记》	金庸	36	正常
2	第01章 古道腾驹惊白发，危峦快剑识青翎	《书剑恩仇录》	金庸	44	正常
3	一个戴水獭皮帽子的朋友	《湘行散记》	沈从文	39	正常
4	你是要灼灼容颜，还是要宜其室家	《诗三百：思无邪》	安意如	36	正常
5	海上的消息	《打开心内的窗》	林清玄	32	正常
6	楔子 一阕词来 南国清秋魂梦绕 十年人散 绣房红烛剑光寒	《七剑下天山》	梁羽生	42	正常
7	祝福	《彷徨》	鲁迅	40	正常
8	一个女长年的故事	《莫泊桑短篇小说集》	莫泊桑	36	正常
"1","第01章 天涯思君不可忘","《倚天屠龙记》","金庸",36,"正常"
"2","第01章 古道腾驹惊白发，危峦快剑识青翎","《书剑恩仇录》","金庸",44,"正常"
"3","一个戴水獭皮帽子的朋友","《湘行散记》","沈从文",39,"正常"
"4","你是要灼灼容颜，还是要宜其室家","《诗三百：思无邪》","安意如",36,"正常"
"5","海上的消息","《打开心内的窗》","林清玄",32,"正常"
"6","楔子 一阕词来 南国清秋魂梦绕 十年人散 绣房红烛剑光寒","《七剑下天山》","梁羽生",42,"正常"
"7","祝福","《彷徨》","鲁迅",40,"正常"
"8","一个女长年的故事","《莫泊桑短篇小说集》","莫泊桑",36,"正常"
2020-04-14 09:12:52.189 DEBUG 7976 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : ControllerAdvice beans: 1 @ExceptionHandler, 1 ResponseBodyAdvice


*/
        map.put(101, new Books(101,"第01章 天涯思君不可忘","《倚天屠龙记》","金庸",36,"正常"));
        map.put(102, new Books(102,"第01章 古道腾驹惊白发，危峦快剑识青翎","《书剑恩仇录》","金庸",44,"正常"));
        map.put(103, new Books(103,"一个戴水獭皮帽子的朋友","《湘行散记》","沈从文",39,"正常"));
        map.put(104, new Books(104,"你是要灼灼容颜，还是要宜其室家","《诗三百：思无邪》","安意如",36,"正常"));
        map.put(105, new Books(105,"海上的消息","《打开心内的窗》","林清玄",32,"正常"));
        map.put(106, new Books(106,"楔子 一阕词来 南国清秋魂梦绕 十年人散 绣房红烛剑光寒","《七剑下天山》","梁羽生",42,"正常"));
        map.put(107, new Books(107,"祝福","《彷徨》","鲁迅",40,"正常"));
        map.put(108, new Books(108,"一个女长年的故事","《莫泊桑短篇小说集》","莫泊桑",36,"正常"));
    }

    public Collection<Books> getBookAll(){
        return map.values();
    }

    public Books getBookById(Integer id){
        return map.get(id);
    }
    private static Integer initId = 1006;
    public boolean save(Books book){
        if(book.getId()==null){
            book.setId(initId++);
        }
        return true;
    }

}
