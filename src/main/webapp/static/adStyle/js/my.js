/**
 * Created by 筱湮 on 2017/6/5.
 */
//验证用户是否登录
function userLogin(){
	var result = false;

	$.ajax({
		async : false,//将async设置为false,才能使得return 返回true/false有效
		type : 'post',
		url : 'logined',
		success : function(msg) {
			if (msg == 'success') {
				result = true;
			} else {
				result = false;
			}
		}
	});

	return result;
}

function calculateSize(longnum){//B

    var count = 0;//计数器
    var o_size = null;
    while(longnum > 1024){
        longnum = longnum / 1024.0;
        count++;
        if(count == 3){
            break;
        }
    }

    longnum = round2(longnum,2);

    if(count == 0){
        longnum = longnum + "B";
    }else if(count == 1){
        longnum = o_size + "KB";
    }else if(count == 2){
        longnum = longnum + "MB";
    }else if(count == 3){
        longnum = longnum + "GB";
    }else{
        alert("计算错误");
    }
    return longnum;
}

function round2(number,fractionDigits){
    with(Math){
        return round(number*pow(10,fractionDigits))/pow(10,fractionDigits);
    }
}