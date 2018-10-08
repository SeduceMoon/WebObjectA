package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("survey")
public class Test {
    @RequestMapping("getCountryList")
    public @ResponseBody
    String getCountryList(){
        return "[\n" +
                "    {\n" +
                "        \"capital\": 129,\n" +
                "        \"code\": \"ABW\",\n" +
                "        \"code2\": \"AW\",\n" +
                "        \"continent\": \"North America\",\n" +
                "        \"gNPOld\": 793,\n" +
                "        \"gnp\": 828,\n" +
                "        \"governmentForm\": \"Nonmetropolitan Territory of The Netherlands\",\n" +
                "        \"headOfState\": \"Beatrix\",\n" +
                "        \"indepYear\": \"\",\n" +
                "        \"lifeExpectancy\": 78.4,\n" +
                "        \"localName\": \"Aruba\",\n" +
                "        \"name\": \"Aruba\",\n" +
                "        \"population\": 103000,\n" +
                "        \"region\": \"Caribbean\",\n" +
                "        \"surfaceArea\": 193\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 1,\n" +
                "        \"code\": \"AFG\",\n" +
                "        \"code2\": \"AF\",\n" +
                "        \"continent\": \"Asia\",\n" +
                "        \"gNPOld\": \"\",\n" +
                "        \"gnp\": 5976,\n" +
                "        \"governmentForm\": \"Islamic Emirate\",\n" +
                "        \"headOfState\": \"Mohammad Omar\",\n" +
                "        \"indepYear\": 1919,\n" +
                "        \"lifeExpectancy\": 45.9,\n" +
                "        \"localName\": \"Afganistan/Afqanestan\",\n" +
                "        \"name\": \"Afghanistan\",\n" +
                "        \"population\": 22720000,\n" +
                "        \"region\": \"Southern and Central Asia\",\n" +
                "        \"surfaceArea\": 652090\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 56,\n" +
                "        \"code\": \"AGO\",\n" +
                "        \"code2\": \"AO\",\n" +
                "        \"continent\": \"Africa\",\n" +
                "        \"gNPOld\": 7984,\n" +
                "        \"gnp\": 6648,\n" +
                "        \"governmentForm\": \"Republic\",\n" +
                "        \"headOfState\": \"JosÃ© Eduardo dos Santos\",\n" +
                "        \"indepYear\": 1975,\n" +
                "        \"lifeExpectancy\": 38.3,\n" +
                "        \"localName\": \"Angola\",\n" +
                "        \"name\": \"Angola\",\n" +
                "        \"population\": 12878000,\n" +
                "        \"region\": \"Central Africa\",\n" +
                "        \"surfaceArea\": 1246700\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 62,\n" +
                "        \"code\": \"AIA\",\n" +
                "        \"code2\": \"AI\",\n" +
                "        \"continent\": \"North America\",\n" +
                "        \"gNPOld\": \"\",\n" +
                "        \"gnp\": 63.2,\n" +
                "        \"governmentForm\": \"Dependent Territory of the UK\",\n" +
                "        \"headOfState\": \"Elisabeth II\",\n" +
                "        \"indepYear\": \"\",\n" +
                "        \"lifeExpectancy\": 76.1,\n" +
                "        \"localName\": \"Anguilla\",\n" +
                "        \"name\": \"Anguilla\",\n" +
                "        \"population\": 8000,\n" +
                "        \"region\": \"Caribbean\",\n" +
                "        \"surfaceArea\": 96\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 34,\n" +
                "        \"code\": \"ALB\",\n" +
                "        \"code2\": \"AL\",\n" +
                "        \"continent\": \"Europe\",\n" +
                "        \"gNPOld\": 2500,\n" +
                "        \"gnp\": 3205,\n" +
                "        \"governmentForm\": \"Republic\",\n" +
                "        \"headOfState\": \"Rexhep Mejdani\",\n" +
                "        \"indepYear\": 1912,\n" +
                "        \"lifeExpectancy\": 71.6,\n" +
                "        \"localName\": \"ShqipÃ«ria\",\n" +
                "        \"name\": \"Albania\",\n" +
                "        \"population\": 3401200,\n" +
                "        \"region\": \"Southern Europe\",\n" +
                "        \"surfaceArea\": 28748\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 55,\n" +
                "        \"code\": \"AND\",\n" +
                "        \"code2\": \"AD\",\n" +
                "        \"continent\": \"Europe\",\n" +
                "        \"gNPOld\": \"\",\n" +
                "        \"gnp\": 1630,\n" +
                "        \"governmentForm\": \"Parliamentary Coprincipality\",\n" +
                "        \"headOfState\": \"\",\n" +
                "        \"indepYear\": 1278,\n" +
                "        \"lifeExpectancy\": 83.5,\n" +
                "        \"localName\": \"Andorra\",\n" +
                "        \"name\": \"Andorra\",\n" +
                "        \"population\": 78000,\n" +
                "        \"region\": \"Southern Europe\",\n" +
                "        \"surfaceArea\": 468\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 33,\n" +
                "        \"code\": \"ANT\",\n" +
                "        \"code2\": \"AN\",\n" +
                "        \"continent\": \"North America\",\n" +
                "        \"gNPOld\": \"\",\n" +
                "        \"gnp\": 1941,\n" +
                "        \"governmentForm\": \"Nonmetropolitan Territory of The Netherlands\",\n" +
                "        \"headOfState\": \"Beatrix\",\n" +
                "        \"indepYear\": \"\",\n" +
                "        \"lifeExpectancy\": 74.7,\n" +
                "        \"localName\": \"Nederlandse Antillen\",\n" +
                "        \"name\": \"Netherlands Antilles\",\n" +
                "        \"population\": 217000,\n" +
                "        \"region\": \"Caribbean\",\n" +
                "        \"surfaceArea\": 800\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 65,\n" +
                "        \"code\": \"ARE\",\n" +
                "        \"code2\": \"AE\",\n" +
                "        \"continent\": \"Asia\",\n" +
                "        \"gNPOld\": 36846,\n" +
                "        \"gnp\": 37966,\n" +
                "        \"governmentForm\": \"Emirate Federation\",\n" +
                "        \"headOfState\": \"Zayid bin Sultan al-Nahayan\",\n" +
                "        \"indepYear\": 1971,\n" +
                "        \"lifeExpectancy\": 74.1,\n" +
                "        \"localName\": \"Al-Imarat al-Â´Arabiya al-Muttahida\",\n" +
                "        \"name\": \"United Arab Emirates\",\n" +
                "        \"population\": 2441000,\n" +
                "        \"region\": \"Middle East\",\n" +
                "        \"surfaceArea\": 83600\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 69,\n" +
                "        \"code\": \"ARG\",\n" +
                "        \"code2\": \"AR\",\n" +
                "        \"continent\": \"South America\",\n" +
                "        \"gNPOld\": 323310,\n" +
                "        \"gnp\": 340238,\n" +
                "        \"governmentForm\": \"Federal Republic\",\n" +
                "        \"headOfState\": \"Fernando de la RÃºa\",\n" +
                "        \"indepYear\": 1816,\n" +
                "        \"lifeExpectancy\": 75.1,\n" +
                "        \"localName\": \"Argentina\",\n" +
                "        \"name\": \"Argentina\",\n" +
                "        \"population\": 37032000,\n" +
                "        \"region\": \"South America\",\n" +
                "        \"surfaceArea\": 2780400\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 126,\n" +
                "        \"code\": \"ARM\",\n" +
                "        \"code2\": \"AM\",\n" +
                "        \"continent\": \"Asia\",\n" +
                "        \"gNPOld\": 1627,\n" +
                "        \"gnp\": 1813,\n" +
                "        \"governmentForm\": \"Republic\",\n" +
                "        \"headOfState\": \"Robert KotÂšarjan\",\n" +
                "        \"indepYear\": 1991,\n" +
                "        \"lifeExpectancy\": 66.4,\n" +
                "        \"localName\": \"Hajastan\",\n" +
                "        \"name\": \"Armenia\",\n" +
                "        \"population\": 3520000,\n" +
                "        \"region\": \"Middle East\",\n" +
                "        \"surfaceArea\": 29800\n" +
                "    },\n" +
                "    {\n" +
                "        \"capital\": 54,\n" +
                "        \"code\": \"ASM\",\n" +
                "        \"code2\": \"AS\",\n" +
                "        \"continent\": \"Oceania\",\n" +
                "        \"gNPOld\": \"\",\n" +
                "        \"gnp\": 334,\n" +
                "        \"governmentForm\": \"US Territory\",\n" +
                "        \"headOfState\": \"George W. Bush\",\n" +
                "        \"indepYear\": \"\",\n" +
                "        \"lifeExpectancy\": 75.1,\n" +
                "        \"localName\": \"Amerika Samoa\",\n" +
                "        \"name\": \"American Samoa\",\n" +
                "        \"population\": 68000,\n" +
                "        \"region\": \"Polynesia\",\n" +
                "        \"surfaceArea\": 199\n" +
                "    }]";
    }
}
