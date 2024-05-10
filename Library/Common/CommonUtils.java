public class CommonUtils {
    public static String xssReplace(String attack_string) {
        boolean use_html = true;
        String attack_string_low = "";
        if(use_html) // HTML tag를 사용하게 할 경우 부분 허용
        {
            attack_string = attack_string.replaceAll("<","&lt;"); //HTML tag를 모두 제거
            attack_string = attack_string.replaceAll(">","&gt;");
            // 허용할 태그 <p> 복구
            attack_string = attack_string.replaceAll("&lt;p&gt;","<p>");
            attack_string = attack_string.replaceAll("&lt;/p&gt;","</p>");
            // 스크립트 문자열 필터링 (필요한경우 보안가이드에 첨부된 구문 추가)
            attack_string_low= attack_string.toLowerCase();
            if(attack_string_low.contains("onafterprint")||
                    attack_string_low.contains("onbeforescriptexecute")||
                    attack_string_low.contains("oncontextmenu")||
                    attack_string_low.contains("ondragstart")||
                    attack_string_low.contains("onfullscreenchange")||
                    attack_string_low.contains("onafterscriptexecute")||
                    attack_string_low.contains("onbeforeunload")||
                    attack_string_low.contains("oncopy")||
                    attack_string_low.contains("ondrop")||
                    attack_string_low.contains("onhashchange")||
                    attack_string_low.contains("onanimationcancel")||
                    attack_string_low.contains("onbegin")||
                    attack_string_low.contains("oncuechange")||
                    attack_string_low.contains("ondurationchange")||
                    attack_string_low.contains("oninput")||
                    attack_string_low.contains("onanimationend")||
                    attack_string_low.contains("onblur")||
                    attack_string_low.contains("oncut")||
                    attack_string_low.contains("onend")||
                    attack_string_low.contains("oninvalid")||
                    attack_string_low.contains("onanimationiteration")||
                    attack_string_low.contains("onbounce")||
                    attack_string_low.contains("ondblclick")||
                    attack_string_low.contains("onended")||
                    attack_string_low.contains("onkeydown")||
                    attack_string_low.contains("onanimationstart")||
                    attack_string_low.contains("oncanplay")||
                    attack_string_low.contains("ondrag")||
                    attack_string_low.contains("onerror")||
                    attack_string_low.contains("onkeypress")||
                    attack_string_low.contains("onauxclick")||
                    attack_string_low.contains("oncanplaythrough")||
                    attack_string_low.contains("ondragend")||
                    attack_string_low.contains("onfinish")||
                    attack_string_low.contains("onkeyup")||
                    attack_string_low.contains("onbeforecopy")||
                    attack_string_low.contains("onchange")||
                    attack_string_low.contains("ondragenter")||
                    attack_string_low.contains("onfocus")||
                    attack_string_low.contains("onload")||
                    attack_string_low.contains("onbeforecut")||
                    attack_string_low.contains("onclick")||
                    attack_string_low.contains("ondragleave")||
                    attack_string_low.contains("onfocusin")||
                    attack_string_low.contains("onloadeddata")||
                    attack_string_low.contains("onbeforeprint")||
                    attack_string_low.contains("onclose")||
                    attack_string_low.contains("ondragover")||
                    attack_string_low.contains("onfocusout")||
                    attack_string_low.contains("onloadedmetadata")||
                    attack_string_low.contains("onmousewheel")||
                    attack_string_low.contains("onpointerleave")||
                    attack_string_low.contains("onresize")||
                    attack_string_low.contains("onsubmit")||
                    attack_string_low.contains("onunhandledrejection")||
                    attack_string_low.contains("onmozfullscreenchange")||
                    attack_string_low.contains("onpointermove")||
                    attack_string_low.contains("onscroll")||
                    attack_string_low.contains("ontimeupdate")||
                    attack_string_low.contains("onunload")||
                    attack_string_low.contains("onpagehide")||
                    attack_string_low.contains("onpointerout")||
                    attack_string_low.contains("onsearch")||
                    attack_string_low.contains("ontoggle")||
                    attack_string_low.contains("onvolumechange")||
                    attack_string_low.contains("onpageshow")||
                    attack_string_low.contains("onpointerover")||
                    attack_string_low.contains("onseeked")||
                    attack_string_low.contains("ontouchend")||
                    attack_string_low.contains("onwebkitanimationend")||
                    attack_string_low.contains("onpaste")||
                    attack_string_low.contains("onpointerrawupdate")||
                    attack_string_low.contains("onseeking")||
                    attack_string_low.contains("ontouchmove")||
                    attack_string_low.contains("onwebkitanimationiteration")||
                    attack_string_low.contains("onpause")||
                    attack_string_low.contains("onpointerup")||
                    attack_string_low.contains("onselect")||
                    attack_string_low.contains("ontouchstart")||
                    attack_string_low.contains("onwebkitanimationstart")||
                    attack_string_low.contains("onplay")||
                    attack_string_low.contains("onpopstate")||
                    attack_string_low.contains("onselectionchange")||
                    attack_string_low.contains("ontransitioncancel")||
                    attack_string_low.contains("onwebkittransitionend")||
                    attack_string_low.contains("onplaying")||
                    attack_string_low.contains("onprogress")||
                    attack_string_low.contains("onselectstart")||
                    attack_string_low.contains("ontransitionend")||
                    attack_string_low.contains("onwheel")||
                    attack_string_low.contains("onloadend")||
                    attack_string_low.contains("onmousedown")||
                    attack_string_low.contains("onmousemove")||
                    attack_string_low.contains("onmouseup")||
                    attack_string_low.contains("onpointerenter")||
                    attack_string_low.contains("onloadstart")||
                    attack_string_low.contains("onmouseenter")||
                    attack_string_low.contains("onmouseout")||
                    attack_string_low.contains("ontransitionstart")||
                    attack_string_low.contains("onrepeat")||
                    attack_string_low.contains("onmessage")||
                    attack_string_low.contains("onmouseleave")||
                    attack_string_low.contains("onmouseover")||
                    attack_string_low.contains("onpointerdown")||
                    attack_string_low.contains("onreset")||
                    attack_string_low.contains("onshow")||
                    attack_string_low.contains("onstart")||
                    attack_string_low.contains("ontransitionrun")||
                    attack_string_low.contains("href"))
            {
                attack_string = attack_string_low;
                attack_string = attack_string.replaceAll("onafterprint","x-onafterprint");
                attack_string = attack_string.replaceAll("onbeforescriptexecute","x-onbeforescriptexecute");
                attack_string = attack_string.replaceAll("oncontextmenu","x-oncontextmenu");
                attack_string = attack_string.replaceAll("ondragstart","x-ondragstart");
                attack_string = attack_string.replaceAll("onfullscreenchange","x-onfullscreenchange");
                attack_string = attack_string.replaceAll("onafterscriptexecute","x-onafterscriptexecute");
                attack_string = attack_string.replaceAll("onbeforeunload","x-onbeforeunload");
                attack_string = attack_string.replaceAll("oncopy","x-oncopy");
                attack_string = attack_string.replaceAll("ondrop","x-ondrop");
                attack_string = attack_string.replaceAll("onhashchange","x-onhashchange");
                attack_string = attack_string.replaceAll("onanimationcancel","x-onanimationcancel");
                attack_string = attack_string.replaceAll("onbegin","x-onbegin");
                attack_string = attack_string.replaceAll("oncuechange","x-oncuechange");
                attack_string = attack_string.replaceAll("ondurationchange","x-ondurationchange");
                attack_string = attack_string.replaceAll("oninput","x-oninput");
                attack_string = attack_string.replaceAll("onanimationend","x-onanimationend");
                attack_string = attack_string.replaceAll("onblur","x-onblur");
                attack_string = attack_string.replaceAll("oncut","x-oncut");
                attack_string = attack_string.replaceAll("onend","x-onend");
                attack_string = attack_string.replaceAll("oninvalid","x-oninvalid");
                attack_string = attack_string.replaceAll("onanimationiteration","x-onanimationiteration");
                attack_string = attack_string.replaceAll("onbounce","x-onbounce");
                attack_string = attack_string.replaceAll("ondblclick","x-ondblclick");
                attack_string = attack_string.replaceAll("onended","x-onended");
                attack_string = attack_string.replaceAll("onkeydown","x-onkeydown");
                attack_string = attack_string.replaceAll("onanimationstart","x-onanimationstart");
                attack_string = attack_string.replaceAll("oncanplay","x-oncanplay");
                attack_string = attack_string.replaceAll("ondrag","x-ondrag");
                attack_string = attack_string.replaceAll("onerror","x-onerror");
                attack_string = attack_string.replaceAll("onkeypress","x-onkeypress");
                attack_string = attack_string.replaceAll("onauxclick","x-onauxclick");
                attack_string = attack_string.replaceAll("oncanplaythrough","x-oncanplaythrough");
                attack_string = attack_string.replaceAll("ondragend","x-ondragend");
                attack_string = attack_string.replaceAll("onfinish","x-onfinish");
                attack_string = attack_string.replaceAll("onkeyup","x-onkeyup");
                attack_string = attack_string.replaceAll("onbeforecopy","x-onbeforecopy");
                attack_string = attack_string.replaceAll("onchange","x-onchange");
                attack_string = attack_string.replaceAll("ondragenter","x-ondragenter");
                attack_string = attack_string.replaceAll("onfocus","x-onfocus");
                attack_string = attack_string.replaceAll("onload","x-onload");
                attack_string = attack_string.replaceAll("onbeforecut","x-onbeforecut");
                attack_string = attack_string.replaceAll("onclick","x-onclick");
                attack_string = attack_string.replaceAll("ondragleave","x-ondragleave");
                attack_string = attack_string.replaceAll("onfocusin","x-onfocusin");
                attack_string = attack_string.replaceAll("onloadeddata","x-onloadeddata");
                attack_string = attack_string.replaceAll("onbeforeprint","x-onbeforeprint");
                attack_string = attack_string.replaceAll("onclose","x-onclose");
                attack_string = attack_string.replaceAll("ondragover","x-ondragover");
                attack_string = attack_string.replaceAll("onfocusout","x-onfocusout");
                attack_string = attack_string.replaceAll("onloadedmetadata","x-onloadedmetadata");
                attack_string = attack_string.replaceAll("onmousewheel","x-onmousewheel");
                attack_string = attack_string.replaceAll("onpointerleave","x-onpointerleave");
                attack_string = attack_string.replaceAll("onresize","x-onresize");
                attack_string = attack_string.replaceAll("onsubmit","x-onsubmit");
                attack_string = attack_string.replaceAll("onunhandledrejection","x-onunhandledrejection");
                attack_string = attack_string.replaceAll("onmozfullscreenchange","x-onmozfullscreenchange");
                attack_string = attack_string.replaceAll("onpointermove","x-onpointermove");
                attack_string = attack_string.replaceAll("onscroll","x-onscroll");
                attack_string = attack_string.replaceAll("ontimeupdate","x-ontimeupdate");
                attack_string = attack_string.replaceAll("onunload","x-onunload");
                attack_string = attack_string.replaceAll("onpagehide","x-onpagehide");
                attack_string = attack_string.replaceAll("onpointerout","x-onpointerout");
                attack_string = attack_string.replaceAll("onsearch","x-onsearch");
                attack_string = attack_string.replaceAll("ontoggle","x-ontoggle");
                attack_string = attack_string.replaceAll("onvolumechange","x-onvolumechange");
                attack_string = attack_string.replaceAll("onpageshow","x-onpageshow");
                attack_string = attack_string.replaceAll("onpointerover","x-onpointerover");
                attack_string = attack_string.replaceAll("onseeked","x-onseeked");
                attack_string = attack_string.replaceAll("ontouchend","x-ontouchend");
                attack_string = attack_string.replaceAll("onwebkitanimationend","x-onwebkitanimationend");
                attack_string = attack_string.replaceAll("onpaste","x-onpaste");
                attack_string = attack_string.replaceAll("onpointerrawupdate","x-onpointerrawupdate");
                attack_string = attack_string.replaceAll("onseeking","x-onseeking");
                attack_string = attack_string.replaceAll("ontouchmove","x-ontouchmove");
                attack_string = attack_string.replaceAll("onwebkitanimationiteration","x-onwebkitanimationiteration");
                attack_string = attack_string.replaceAll("onpause","x-onpause");
                attack_string = attack_string.replaceAll("onpointerup","x-onpointerup");
                attack_string = attack_string.replaceAll("onselect","x-onselect");
                attack_string = attack_string.replaceAll("ontouchstart","x-ontouchstart");
                attack_string = attack_string.replaceAll("onwebkitanimationstart","x-onwebkitanimationstart");
                attack_string = attack_string.replaceAll("onplay","x-onplay");
                attack_string = attack_string.replaceAll("onpopstate","x-onpopstate");
                attack_string = attack_string.replaceAll("onselectionchange","x-onselectionchange");
                attack_string = attack_string.replaceAll("ontransitioncancel","x-ontransitioncancel");
                attack_string = attack_string.replaceAll("onwebkittransitionend","x-onwebkittransitionend");
                attack_string = attack_string.replaceAll("onplaying","x-onplaying");
                attack_string = attack_string.replaceAll("onprogress","x-onprogress");
                attack_string = attack_string.replaceAll("onselectstart","x-onselectstart");
                attack_string = attack_string.replaceAll("ontransitionend","x-ontransitionend");
                attack_string = attack_string.replaceAll("onwheel","x-onwheel");
                attack_string = attack_string.replaceAll("onloadend","x-onloadend");
                attack_string = attack_string.replaceAll("onmousedown","x-onmousedown");
                attack_string = attack_string.replaceAll("onmousemove","x-onmousemove");
                attack_string = attack_string.replaceAll("onmouseup","x-onmouseup");
                attack_string = attack_string.replaceAll("onpointerenter","x-onpointerenter");
                attack_string = attack_string.replaceAll("onloadstart","x-onloadstart");
                attack_string = attack_string.replaceAll("onmouseenter","x-onmouseenter");
                attack_string = attack_string.replaceAll("onmouseout","x-onmouseout");
                attack_string = attack_string.replaceAll("ontransitionstart","x-ontransitionstart");
                attack_string = attack_string.replaceAll("onrepeat","x-onrepeat");
                attack_string = attack_string.replaceAll("onmessage","x-onmessage");
                attack_string = attack_string.replaceAll("onmouseleave","x-onmouseleave");
                attack_string = attack_string.replaceAll("onmouseover","x-onmouseover");
                attack_string = attack_string.replaceAll("onpointerdown","x-onpointerdown");
                attack_string = attack_string.replaceAll("onreset","x-onreset");
                attack_string = attack_string.replaceAll("onshow","x-onshow");
                attack_string = attack_string.replaceAll("onstart","x-onstart");
                attack_string = attack_string.replaceAll("ontransitionrun","x-ontransitionrun");
                attack_string = attack_string.replaceAll("href","x-href");
            }
        }else // HTML tag를 사용하지 못하게 할 경우
        {
            attack_string = attack_string.replaceAll("<", "&lt;");
            attack_string = attack_string.replaceAll(">", "&gt;");
            attack_string = attack_string.replaceAll("&", "&amp;");
            attack_string = attack_string.replaceAll("#", "&#35;");
            attack_string = attack_string.replaceAll("\'", "&#x27;");
            attack_string = attack_string.replaceAll("\"", "&quot;");
            attack_string = attack_string.replaceAll("\\(", "&#40;");
            attack_string = attack_string.replaceAll("\\)", "&#41;");
            attack_string = attack_string.replaceAll("\\\\", "&#x2F;");
        }

        return attack_string;
    }

    /**
     * obj 가 empty string 이면 true
     * @param obj 확인할 object
     * @return obj 가 empty string 이면 true
     */
    public static final boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        } else if ("".equals(obj)) {
            return true;
        } else if ("undefined".equals(obj)) {
            return true;
        } else if (obj instanceof Object[]) {
            for (Object v : ((Object[])obj)) {
                if (!isEmpty(v)) return false;
            }
            return true;
        } else if ("&quot;&quot;".equals(obj)) {
            return true;
        }
        else return false;
    }
}