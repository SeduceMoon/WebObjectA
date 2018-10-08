
var colorCheck="rgb(92, 184, 92)";
var colorNoCheck="rgb(256, 256, 256)";


function isPhone() {
    var h = window.screen.height
    var w = window.screen.width
    if (h > w) return true;
    else return false;
}
String.prototype.replaceAllChar = function(reallyDo, replaceWith, ignoreCase) {
    if(!RegExp.prototype.isPrototypeOf(reallyDo)) {
        return this.replace(new RegExp(reallyDo, (ignoreCase ? "gi" : "g")), replaceWith);
    } else {
        return this.replace(reallyDo, replaceWith);
    }
}

/**
 * 验证手机号
 * @param str
 * @returns {boolean}
 */
function isPhoneCanUse(str) {
    var phoneRe=/^[1][3,4,5,7,8][0-9]{9}$/;
    if (!phoneRe.test(str)) {
        return false;
    } else {
        return true;
    }
}

/**
 * 正则验证身份证
 * @param str
 * @returns {boolean}
 */
function isSfCanUse(str) {
    var sfRe=/^[0-9]{17}[0-9xX]$/;
    if (!sfRe.test(str)) {
        return false;
    } else {
        return true;
    }
}

/**
 * 正则验证护照号
 * @param str
 * @returns {boolean}
 */
function isPassportCanUse(str) {
    var sfRe=/^[a-zA-Z][0-9]{8}$/;
    if (!sfRe.test(str)) {
        return false;
    } else {
        return true;
    }
}

function canSend(formObject,type) {
    var d = {};
    var t = formObject.serializeArray();
    var caluse=true;
    $.each(t, function() {
        if(this.value=="")
            caluse=false;
        else {
            if (type == 1) {
                if (this.name == "phone")
                    caluse = isPhoneCanUse(this.value)
                if (this.name == "sf")
                    caluse = isSfCanUse(this.value)
                if (this.name == "name") {
                    d[this.name] = this.value + "·" + $("#last-name").val();
                    $("#first-name").val(d[this.name]);
                }
                else d[this.name] = this.value;
            }else {
                if (this.name == "passport")
                    caluse = isPassportCanUse(this.value)
            }
        }

    });
    return [caluse,d];
}
function getCountryList(func) {
    $.get({
        url:"http://192.168.2.100:81/survey/getSchoolList",
        success:func,
        error:function (e) {
            alert("数据下载出错"+e.toString());
        }
    })
}

