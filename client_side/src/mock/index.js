import Mock from 'mockjs'
const login =Mock.mock('http://localhost:8080/test/?username=qwe&password=qwe ','post',function (req){

    return body
})
const personal=Mock.mock('http://localhost:8080/user/findDetail','get',{
    "user": {
        "role": 32,
        "name": "什制点认为政装",
        "id": 14,
        "password": "dolor",
        "sex": "女",
        "record_date": "1980-04-23",
        "birthday": "2020-08-01",
        "location": "ipsum dolore enim dolore culpa",
        "post_qty": 25,
        "reply_qty": 87,
        "head_url": "http://rlivudph.ie/rnplrf"
    },
    "posts": [
        {
            "id": 45,
            "title": "现切条火",
            "content": "elit id in incididunt",
            "date_time": "1996-09-02 02:09:26",
            "click_qty": 34,
            "reply_qty": 20,
            "user": {
                "role": 66,
                "name": "革因民许府",
                "id": 87,
                "password": "nostrud",
                "sex": "女",
                "record_date": "1998-12-06",
                "birthday": "2006-11-19",
                "location": "cupidatat ad",
                "post_qty": 58,
                "reply_qty": 19,
                "head_url": "http://udqhyn.it/qoi"
            },
            "plate": {
                "id": 42,
                "name": "用共感五劳加回",
                "detail": "elit Lorem aliquip culpa ut",
                "post_qty": 14,
                "click_qty": 12,
                "plate_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 10,
            "title": "接明代收保",
            "content": "elit id",
            "date_time": "2009-01-06 16:32:22",
            "click_qty": 49,
            "reply_qty": 77,
            "user": {
                "role": 44,
                "name": "全装此派",
                "id": 92,
                "password": "ut",
                "sex": "女",
                "record_date": "2001-07-22",
                "birthday": "1985-10-19",
                "location": "Duis est qui id",
                "post_qty": 57,
                "reply_qty": 40,
                "head_url": "http://nryhqc.fr/huwzix"
            },
            "plate": {
                "id": 10,
                "name": "应查层最把工",
                "detail": "ut et",
                "post_qty": 48,
                "click_qty": 38,
                "plate_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 99,
            "title": "百铁观太却社",
            "content": "mollit sit exercitation laboris culpa",
            "date_time": "1992-05-08 07:51:54",
            "click_qty": 36,
            "reply_qty": 11,
            "user": {
                "role": 59,
                "name": "己说科什",
                "id": 90,
                "password": "in dolore laborum",
                "sex": "女",
                "record_date": "1996-08-19",
                "birthday": "2002-09-15",
                "location": "tempor proident consequat eiusmod",
                "post_qty": 78,
                "reply_qty": 73,
                "head_url": "http://dbojxi.tel/fcqsprhj"
            },
            "plate": {
                "id": 6,
                "name": "很入不学",
                "detail": "sed cupidatat in",
                "post_qty": 52,
                "click_qty": 45,
                "plate_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 59,
            "title": "从体布光气然",
            "content": "commodo nulla ut ex",
            "date_time": "2022-02-23 14:51:02",
            "click_qty": 22,
            "reply_qty": 57,
            "user": {
                "role": 4,
                "name": "今才细形",
                "id": 27,
                "password": "esse labore reprehenderit exercitation",
                "sex": "女",
                "record_date": "1988-11-30",
                "birthday": "2015-10-16",
                "location": "ea fugiat do Ut occaecat",
                "post_qty": 15,
                "reply_qty": 56,
                "head_url": "http://apad.sm/tquoj"
            },
            "plate": {
                "id": 31,
                "name": "起两定员越立开",
                "detail": "Duis laboris velit enim dolor",
                "post_qty": 76,
                "click_qty": 15,
                "plate_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 18,
            "title": "果义七号事单集",
            "content": "nisi nostrud aliquip",
            "date_time": "1991-05-11 05:51:41",
            "click_qty": 8,
            "reply_qty": 47,
            "user": {
                "role": 80,
                "name": "前理林这传交",
                "id": 77,
                "password": "reprehenderit enim",
                "sex": "男",
                "record_date": "2005-12-12",
                "birthday": "2014-01-11",
                "location": "aute",
                "post_qty": 55,
                "reply_qty": 30,
                "head_url": "http://fyxof.aero/jfjfp"
            },
            "plate": {
                "id": 78,
                "name": "说家改机知酸",
                "detail": "ut fugiat occaecat pariatur",
                "post_qty": 44,
                "click_qty": 21,
                "plate_image": "http://dummyimage.com/400x400"
            }
        }
    ],
    "activities": [
        {
            "id": 35,
            "title": "水气万",
            "content": "dolor Excepteur dolore",
            "activity_image": "http://dummyimage.com/400x400",
            "date_time": "2004-12-28 11:36:03",
            "num_required": 75,
            "num_participants": 72,
            "state": 3,
            "user": {
                "role": 45,
                "name": "实花器况商极",
                "id": 76,
                "password": "aliqua elit dolor",
                "sex": "男",
                "record_date": "1994-12-10",
                "birthday": "2011-06-20",
                "location": "mollit aliquip",
                "post_qty": 1,
                "reply_qty": 16,
                "head_url": "http://ydspfcu.coop/rxytfjqmr"
            }
        }
    ],
    "resp":{
    "msg": "Ut sit non proident",
    "status": 200
}
})
const activity=Mock.mock('http://localhost:8080/activity','get',[
    {
        "id": 98,
        "title": "验期华需技省",
        "content": "voluptate dolore consectetur",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1992-06-08 18:33:46",
        "num_required": 13,
        "num_participants": 49,
        "state": 4,
        "user": {
            "role": 90,
            "name": "算至都",
            "id": 45,
            "password": "nulla",
            "sex": "女",
            "record_date": "2003-03-22",
            "birthday": "2018-12-28",
            "location": "tempor enim",
            "post_qty": 31,
            "reply_qty": 10,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
    {
        "id": 81,
        "title": "花式a况分",
        "content": "nulla",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "2001-04-04 18:00:54",
        "num_required": 38,
        "num_participants": 32,
        "state": "officia consectetur",
        "user": {
            "role": 75,
            "name": "却平fad段东",
            "id": 67,
            "password": "cillum dolor dolore in consectetur",
            "sex": "女",
            "record_date": "2015-06-24",
            "birthday": "1988-03-16",
            "location": "sed nostrud ad ipsum Lorem",
            "post_qty": 30,
            "reply_qty": 12,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
    {
        "id": 98,
        "title": "验期123华需技省",
        "content": "voluptate dolore consectetur",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1992-06-08 18:33:46",
        "num_required": 13,
        "num_participants": 49,
        "state": 0,
        "user": {
            "role": 90,
            "name": "算至56668都",
            "id": 45,
            "password": "nulla",
            "sex": "女",
            "record_date": "2003-03-22",
            "birthday": "2018-12-28",
            "location": "tempor enim",
            "post_qty": 31,
            "reply_qty": 10,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
    {
        "id": 98,
        "title": "验期华需技tsdt省",
        "content": "voluptate dolore consectetur",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1992-06-08 18:33:46",
        "num_required": 13,
        "num_participants": 49,
        "state": 5,
        "user": {
            "role": 90,
            "name": "算至dsaa都",
            "id": 45,
            "password": "nulla",
            "sex": "女",
            "record_date": "2003-03-22",
            "birthday": "2018-12-28",
            "location": "tempor enim",
            "post_qty": 31,
            "reply_qty": 10,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
    {
        "id": 98,
        "title": "验期华21需技省",
        "content": "voluptate dolore consectetur",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1992-06-08 18:33:46",
        "num_required": 13,
        "num_participants": 49,
        "state": 3,
        "user": {
            "role": 90,
            "name": "算至3e都",
            "id": 45,
            "password": "nulla",
            "sex": "女",
            "record_date": "2003-03-22",
            "birthday": "2018-12-28",
            "location": "tempor enim",
            "post_qty": 31,
            "reply_qty": 10,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
])
const testData=Mock.mock('http://localhost:8080/test','get',
{
    "resp": {
    "msg": "200",
        "status": 200
},
    "user": {
    "role": 4,
        "name": "科头程度",
        "id": 56,
        "password": "consectetur",
        "sex": "男",
        "record_date": "2014-05-13",
        "birthday": "2020-12-13",
        "location": "ea",
        "post_num": 62,
        "reply_num": 4,
        "head_image": "http://dummyimage.com/400x400"

}

})
const post =Mock.mock('http://localhost:8080/posttest','get',{
    "post": {
        "id": 61,
        "title": "完路和接织形",
        "post_image": "http://dummyimage.com/400x400",
        "content": "minim",
        "date_time": "1990-12-07 18:35:58",
        "click_qty": 20,
        "reply_qty": 11,
        "user": {
            "role": 27,
            "name": "题影每民走常",
            "id": 76,
            "password": "est",
            "sex": "女",
            "record_date": "1972-03-15",
            "birthday": "2018-02-07",
            "location": "qui labore do",
            "post_num": 66,
            "reply_num": 25,
            "head_image": "http://dummyimage.com/400x400"
        }
    },
    "comments": [
        {
            "id": 19,
            "content": "in fugiat adipisicing dolor irure",
            "date_time": "1992-11-01 23:53:45",
            "up_qty": 5,
            "user": {
                "role": 91,
                "name": "议而知先从西",
                "id": 54,
                "password": "ut Excepteur qui incididunt in",
                "sex": "女",
                "record_date": "1997-01-23",
                "birthday": "2005-02-05",
                "location": "dolor ut magna Lorem tempor",
                "post_num": 65,
                "reply_num": 45,
                "head_image": "http://dummyimage.com/400x400"
            },
            "post": {
                "id": 2,
                "title": "斯种法己小上",
                "post_image": "http://dummyimage.com/400x400",
                "content": "eiusmod Ut in",
                "date_time": "1992-05-10 21:21:17",
                "click_qty": 21,
                "reply_qty": 21,
                "user": {
                    "role": 86,
                    "name": "划易温重相发",
                    "id": 98,
                    "password": "consequat proident exercitation",
                    "sex": "男",
                    "record_date": "1994-03-29",
                    "birthday": "1972-08-18",
                    "location": "sint deserunt",
                    "post_num": 50,
                    "reply_num": 59,
                    "head_image": "http://dummyimage.com/400x400"
                }
            }
        },
        {
            "id": 22,
            "content": "<p>hello</p>",
            "date_time": "2021-12-31 13:42:53",
            "up_qty": 38,
            "user": {
                "role": 22,
                "name": "法称少原从期",
                "id": 48,
                "password": "incididunt et ullamco",
                "sex": "女",
                "record_date": "1972-12-28",
                "birthday": "1996-10-29",
                "location": "dolore in Lorem cillum",
                "post_num": 66,
                "reply_num": 8,
                "head_image": "http://dummyimage.com/400x400"
            },
            "post": {
                "id": 49,
                "title": "马院按证知低",
                "post_image": "http://dummyimage.com/400x400",
                "content": "anim veniam occaecat enim labore",
                "date_time": "1982-10-02 07:20:59",
                "click_qty": 55,
                "reply_qty": 37,
                "user": {
                    "role": 32,
                    "name": "面总有实",
                    "id": 98,
                    "password": "fugiat ipsum aliquip nostrud",
                    "sex": "男",
                    "record_date": "2009-10-30",
                    "birthday": "2006-01-26",
                    "location": "laboris deserunt labore in sit",
                    "post_num": 65,
                    "reply_num": 30,
                    "head_image": "http://dummyimage.com/400x400"
                }
            }
        }
    ],
    "resp": {
        "msg": "aliquip pariatur",
        "status": 41
    }
})
const plate=Mock.mock('http://localhost:8080/plate','get',{
    forum:[{
    id: 123,
    name: 'abc',
    explain: 'dfjskldfj',
    click_qty: 5885,
    post_qty: 655,
    plate_img: '/src/assets/test2.png',
},{
        id: 123434,
        name: 'a24bsdfsc',
        explain: '242435',
        click_qty: 6685885,
        post_qty: 6755,
        plate_img: '/src/assets/test2.png',
    },
        {
            id: 1263334,
            name: 'a2zsdf 4bc',
            explain: '242435',
            click_qty: 6685885,
            post_qty: 6755,
            plate_img: '/src/assets/test2.png',
        },
        {
            id: 14,
            name: 'a24zxcfwebc',
            explain: '242435',
            click_qty: 6685885,
            post_qty: 6755,
            plate_img: '/src/assets/test2.png',
        },

]
    }
)
const plates=Mock.mock("http://localhost:8080/posts",'get',{
    "plate": {
        "id": 56,
        "name": "第分格车铁",
        "detail": "in ullamco sint",
        "post_qty": 71,
        "click_qty": 61,
        "plate_image": "http://dummyimage.com/400x400"
    },
    "posts": [
        {
            "id": 63,
            "title": "须转决反现",
            "post_image": "http://dummyimage.com/400x400",
            "content": "enim culpa cupidatat",
            "date_time": "1990-04-07 00:50:27",
            "click_qty": 84,
            "reply_qty": 3,
            "user": {
                "role": 2,
                "name": "真反命多中历",
                "id": 14,
                "password": "sit aliqua tempor",
                "sex": "女",
                "record_date": "2017-06-21",
                "birthday": "1976-03-18",
                "location": "cupidatat anim labore",
                "post_num": 43,
                "reply_num": 14,
                "head_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 62,
            "title": "办快林并家",
            "post_image": "http://dummyimage.com/400x400",
            "content": "adipisicing qui labore officia",
            "date_time": "1998-04-11 10:15:50",
            "click_qty": 64,
            "reply_qty": 4,
            "user": {
                "role": 73,
                "name": "劳建调才所",
                "id": 35,
                "password": "Lorem dolore ipsum cillum ut",
                "sex": "男",
                "record_date": "1996-03-12",
                "birthday": "2009-11-03",
                "location": "in velit",
                "post_num": 44,
                "reply_num": 10,
                "head_image": "http://dummyimage.com/400x400"
            }
        }
    ],
    "resp": {
        "msg": "voluptate eu",
        "status": 6
    }
})