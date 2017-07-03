package com.gede.beatles.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LuceneController {

    private static final String INDEXDIR_DIRECTORY = "D:\\luceneIndex";

    private static final String DATADIR_DIRECTORY = "D:\\luceneData";

    @RequestMapping(value = "/search")
    @ResponseBody
    public Map<String, Object> search() {
        Map<String, Object> resultMap = new HashMap<>();
        File indexDir = new File(INDEXDIR_DIRECTORY);
        File dataDir = new File(DATADIR_DIRECTORY);
        //Analyzer luceneAnalyzer = new StandardAnalyzer(matchVersion)
        return resultMap;

    }

}
