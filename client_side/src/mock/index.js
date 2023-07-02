import Mock from 'mockjs'



const postCo=Mock.mock('http://localhost:8080/post/findall','get',{
    "posts": [
        {
            "id": 21,
            "title": "统题参导",
            "content": "ut aute",
            "date_time": "2000-10-13 23:53:36",
            "click_qty": 52,
            "reply_qty": 39,
            "user": {
                "role": 35,
                "name": "革总十",
                "id": 76,
                "password": "non ut aliquip occaecat pariatur",
                "sex": "男",
                "record_date": "1986-07-02",
                "birthday": "1979-06-28",
                "location": "mollit",
                "post_qty": 82,
                "reply_qty": 78,
                "head_url": "http://wiliap.gt/faksyteygm"
            },
            "plate": {
                "id": 52,
                "name": "或式话清象就",
                "detail": "ad",
                "post_qty": 97,
                "click_qty": 18,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 12
        },
        {
            "id": 18,
            "title": "百目上极",
            "content": "officia sed",
            "date_time": "2020-06-13 16:21:02",
            "click_qty": 40,
            "reply_qty": 27,
            "user": {
                "role": 29,
                "name": "选据力三",
                "id": 5,
                "password": "amet proident laboris deserunt",
                "sex": "男",
                "record_date": "2006-05-30",
                "birthday": "1975-08-28",
                "location": "ut est in minim sit",
                "post_qty": 75,
                "reply_qty": 8,
                "head_url": "http://uojnysyjh.中国互联.网络/jwnxojd"
            },
            "plate": {
                "id": 92,
                "name": "决叫前必习",
                "detail": "Duis nulla velit",
                "post_qty": 45,
                "click_qty": 51,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 81
        },
        {
            "id": 9,
            "title": "集别部县同",
            "content": "deserunt",
            "date_time": "2005-03-03 01:42:50",
            "click_qty": 96,
            "reply_qty": 95,
            "user": {
                "role": 39,
                "name": "应每效铁",
                "id": 38,
                "password": "velit dolor qui",
                "sex": "女",
                "record_date": "2018-05-30",
                "birthday": "1977-11-17",
                "location": "Excepteur mollit velit",
                "post_qty": 83,
                "reply_qty": 85,
                "head_url": "http://bbvxxdb.cm/vlmil"
            },
            "plate": {
                "id": 15,
                "name": "响实无道",
                "detail": "et enim sit",
                "post_qty": 72,
                "click_qty": 94,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 94
        }
    ],
    "resp": {
        "msg": "sit quis commodo qui non",
        "status": 11
    }
})
const changeState=Mock.mock('http://localhost:8080/admin/banUserById','get',{

})
const userList=Mock.mock('http://localhost:8080/admin/findall','get',{
    "users": [
        {
            "role": 11,
            "name": "期步清色多白",
            "id": 49,
            "password": "quis",
            "sex": "女",
            "record_date": "2007-02-25",
            "birthday": "2001-09-06",
            "location": "esse",
            "post_qty": 86,
            "reply_qty": 97,
            "head_url": "http://eeliwe.uk/ktrs"
        },
        {
            "role": 82,
            "name": "理又金改",
            "id": 94,
            "password": "dolore aute",
            "sex": "女",
            "record_date": "2006-01-09",
            "birthday": "2007-09-04",
            "location": "ad esse nisi labore",
            "post_qty": 69,
            "reply_qty": 58,
            "head_url": "http://bqkiqm.aw/ebw"
        },
        {
            "role": 98,
            "name": "求老张权例",
            "id": 53,
            "password": "dolore ad est do consectetur",
            "sex": "男",
            "record_date": "2020-06-29",
            "birthday": "2006-03-06",
            "location": "qui commodo reprehenderit",
            "post_qty": 88,
            "reply_qty": 86,
            "head_url": "http://tkerauit.cu/bpdhb"
        },
        {
            "role": 60,
            "name": "边万铁查它",
            "id": 41,
            "password": "cupidatat Excepteur ad enim",
            "sex": "女",
            "record_date": "1989-01-14",
            "birthday": "1983-09-20",
            "location": "mollit dolor do",
            "post_qty": 33,
            "reply_qty": 72,
            "head_url": "http://smnrlwl.pr/xemlpinf"
        },
        {
            "role": 9,
            "name": "号家口",
            "id": 42,
            "password": "ullamco reprehenderit nulla eiusmod dolor",
            "sex": "女",
            "record_date": "1991-08-06",
            "birthday": "1984-12-12",
            "location": "ipsum ea",
            "post_qty": 87,
            "reply_qty": 27,
            "head_url": "http://dpgh.cc/bvippyt"
        }
    ],
    "resp": {
        "msg": "id pariatur dolore culpa",
        "status": 200
    }
})
const up=Mock.mock('http://localhost:8080/post/up','get',{
    "msg": "Excepteur sed minim veniam non",
    "status": 200
})
const searchPost=Mock.mock('http://localhost:8080/post/findPostByStr','get',{
    "posts": [
        {
            "id": 64,
            "title": "利历开平",
            "content": "et",
            "date_time": "2011-01-31 13:28:21",
            "click_qty": 95,
            "reply_qty": 93,
            "user": {
                "role": 12,
                "name": "处听角月",
                "id": 92,
                "password": "irure magna in nulla",
                "sex": "女",
                "record_date": "2006-12-09",
                "birthday": "2013-11-24",
                "location": "labore do dolore ex",
                "post_qty": 61,
                "reply_qty": 42,
                "head_url": "http://koahgador.nz/moyr"
            },
            "plate": {
                "id": 70,
                "name": "确权适路府",
                "detail": "aliqua nisi ad laboris",
                "post_qty": 47,
                "click_qty": 56,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 98
        },
        {
            "id": 83,
            "title": "身强些和发",
            "content": "ea aliqua exercitation",
            "date_time": "1998-09-11 10:28:34",
            "click_qty": 71,
            "reply_qty": 91,
            "user": {
                "role": 57,
                "name": "经住开市的",
                "id": 36,
                "password": "tempor ad pariatur ut",
                "sex": "女",
                "record_date": "1994-07-09",
                "birthday": "1979-05-11",
                "location": "dolore deserunt",
                "post_qty": 70,
                "reply_qty": 5,
                "head_url": "http://tny.mr/gqbderm"
            },
            "plate": {
                "id": 6,
                "name": "命况部四他",
                "detail": "ipsum",
                "post_qty": 23,
                "click_qty": 34,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 60
        },
        {
            "id": 17,
            "title": "证名种定接她",
            "content": "cillum officia dolore ut exercitation",
            "date_time": "2002-10-16 04:02:40",
            "click_qty": 41,
            "reply_qty": 50,
            "user": {
                "role": 83,
                "name": "部争走领她是由",
                "id": 84,
                "password": "et in elit culpa commodo",
                "sex": "男",
                "record_date": "2013-10-08",
                "birthday": "1995-06-22",
                "location": "non",
                "post_qty": 90,
                "reply_qty": 44,
                "head_url": "http://svfyzcmcw.be/jlqredtuc"
            },
            "plate": {
                "id": 79,
                "name": "满展入片",
                "detail": "fugiat ullamco",
                "post_qty": 39,
                "click_qty": 98,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 15
        },
        {
            "id": 33,
            "title": "易研认受音最",
            "content": "tempor aliquip occaecat ut anim",
            "date_time": "2007-09-28 07:08:33",
            "click_qty": 3,
            "reply_qty": 78,
            "user": {
                "role": 11,
                "name": "龙定选界长",
                "id": 41,
                "password": "nisi laboris ullamco",
                "sex": "男",
                "record_date": "1993-09-05",
                "birthday": "2009-05-21",
                "location": "Duis Excepteur nulla qui velit",
                "post_qty": 74,
                "reply_qty": 71,
                "head_url": "http://uiceygl.su/snaoyngfg"
            },
            "plate": {
                "id": 25,
                "name": "王克状步",
                "detail": "tempor id esse ipsum",
                "post_qty": 39,
                "click_qty": 50,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 42
        },
        {
            "id": 20,
            "title": "二性论积体",
            "content": "mollit minim quis deserunt",
            "date_time": "2020-07-26 14:05:27",
            "click_qty": 25,
            "reply_qty": 100,
            "user": {
                "role": 88,
                "name": "片叫进议展从",
                "id": 85,
                "password": "nostrud ut aute qui do",
                "sex": "男",
                "record_date": "2009-01-16",
                "birthday": "1972-06-28",
                "location": "occaecat velit dolore esse",
                "post_qty": 32,
                "reply_qty": 3,
                "head_url": "http://gfsqxjsxg.net/rojlg"
            },
            "plate": {
                "id": 89,
                "name": "风它易存强气",
                "detail": "nostrud voluptate exercitation in",
                "post_qty": 69,
                "click_qty": 46,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 91
        }
    ],
    "resp": {
        "msg": "Excepteur labore amet Duis sunt",
        "status": 200
    }
})
const search=Mock.mock('http://localhost:8080/activity/findActivityByStr','get',{
    "activities": [
        {
            "id": 34,
            "title": "写口任新里技位",
            "content": "commodo pariatur officia Lorem qui",
            "activity_image": "http://dummyimage.com/400x400",
            "date_time": "2004-12-16 12:46:25",
            "num_required": 65,
            "num_participants": 52,
            "state": 23,
            "user": {
                "role": 92,
                "name": "本院九品选速目",
                "id": 91,
                "password": "incididunt irure in dolore cupidatat",
                "sex": "男",
                "record_date": "2013-04-09",
                "birthday": "1991-03-24",
                "location": "et pariatur nostrud consequat",
                "post_qty": 41,
                "reply_qty": 56,
                "head_url": "http://chapys.fi/wewxevf"
            }
        },
        {
            "id": 60,
            "title": "号明此受",
            "content": "adipisicing fugiat culpa Ut",
            "activity_image": "http://dummyimage.com/400x400",
            "date_time": "2000-05-01 15:00:54",
            "num_required": 63,
            "num_participants": 17,
            "state": 49,
            "user": {
                "role": 34,
                "name": "知长该小",
                "id": 88,
                "password": "dolor consectetur",
                "sex": "男",
                "record_date": "1989-10-20",
                "birthday": "1988-08-20",
                "location": "ex nulla minim",
                "post_qty": 74,
                "reply_qty": 42,
                "head_url": "http://pln.gm/sshqnl"
            }
        },
        {
            "id": 50,
            "title": "圆却积分合酸重",
            "content": "enim",
            "activity_image": "http://dummyimage.com/400x400",
            "date_time": "2006-05-12 05:00:39",
            "num_required": 15,
            "num_participants": 35,
            "state": 86,
            "user": {
                "role": 96,
                "name": "时斗安增走",
                "id": 86,
                "password": "aliquip Excepteur",
                "sex": "男",
                "record_date": "2011-09-29",
                "birthday": "1972-11-03",
                "location": "nulla mollit sit eiusmod",
                "post_qty": 43,
                "reply_qty": 87,
                "head_url": "http://yyfeshg.hk/zrkibjy"
            }
        }
    ],
    "resp": {
        "msg": "qui",
        "status": 200
    }
})
const personal=Mock.mock('http://localhost:8080/user/findDetail','get',{
    "user": {
        "role": 66,
        "name": "成张管引得复光",
        "id": 88,
        "password": "mollit aliquip sint",
        "sex": "女",
        "record_date": "1996-11-04",
        "birthday": "1991-05-07",
        "location": "sit dolore nulla",
        "post_qty": 69,
        "reply_qty": 79,
        "head_url": "http://tcz.gp/wdbqfb"
    },
    "posts": [
        {
            "id": 40,
            "title": "气世号",
            "content": "nulla occaecat nisi Ut",
            "date_time": "1987-01-07 15:44:00",
            "click_qty": 67,
            "reply_qty": 19,
            "user": {
                "role": 95,
                "name": "强大且",
                "id": 58,
                "password": "fugiat exercitation incididunt",
                "sex": "女",
                "record_date": "1989-12-22",
                "birthday": "1990-09-27",
                "location": "qui in dolore amet enim",
                "post_qty": 8,
                "reply_qty": 79,
                "head_url": "http://khbrznpkx.my/ipxmnlhpvj"
            },
            "plate": {
                "id": 80,
                "name": "集么经记报",
                "detail": "cupidatat",
                "post_qty": 28,
                "click_qty": 77,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 31
        },
        {
            "id": 15,
            "title": "组他与音子",
            "content": "dolor adipisicing laboris",
            "date_time": "2010-04-14 17:37:30",
            "click_qty": 5,
            "reply_qty": 90,
            "user": {
                "role": 26,
                "name": "长大究叫统",
                "id": 67,
                "password": "minim ipsum ea magna Lorem",
                "sex": "男",
                "record_date": "1970-08-23",
                "birthday": "2021-01-15",
                "location": "dolor Duis nisi aute anim",
                "post_qty": 19,
                "reply_qty": 49,
                "head_url": "http://mrqcqfpkq.museum/jofgtgpd"
            },
            "plate": {
                "id": 5,
                "name": "理之四酸年片",
                "detail": "dolore est ex",
                "post_qty": 65,
                "click_qty": 90,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 32
        },
        {
            "id": 41,
            "title": "将教往正与正",
            "content": "voluptate",
            "date_time": "1976-04-06 10:13:47",
            "click_qty": 87,
            "reply_qty": 69,
            "user": {
                "role": 22,
                "name": "而意反青严",
                "id": 32,
                "password": "ullamco",
                "sex": "女",
                "record_date": "2015-09-20",
                "birthday": "1994-09-18",
                "location": "dolore",
                "post_qty": 3,
                "reply_qty": 94,
                "head_url": "http://rqs.bo/cosch"
            },
            "plate": {
                "id": 34,
                "name": "车易家产话标",
                "detail": "et quis occaecat Lorem",
                "post_qty": 61,
                "click_qty": 36,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 56
        },
        {
            "id": 13,
            "title": "总少省采单查",
            "content": "sed reprehenderit ad aute",
            "date_time": "1987-08-30 23:25:40",
            "click_qty": 41,
            "reply_qty": 86,
            "user": {
                "role": 57,
                "name": "难号就器委命七",
                "id": 59,
                "password": "enim amet",
                "sex": "男",
                "record_date": "2014-03-03",
                "birthday": "1979-06-09",
                "location": "nulla",
                "post_qty": 71,
                "reply_qty": 61,
                "head_url": "http://paf.ms/xmbe"
            },
            "plate": {
                "id": 100,
                "name": "文信周支通",
                "detail": "commodo id",
                "post_qty": 94,
                "click_qty": 4,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 61
        },
        {
            "id": 56,
            "title": "制两还做华图",
            "content": "dolor anim",
            "date_time": "2022-04-27 17:05:14",
            "click_qty": 98,
            "reply_qty": 33,
            "user": {
                "role": 18,
                "name": "技每表好",
                "id": 94,
                "password": "ipsum amet nulla et officia",
                "sex": "女",
                "record_date": "2016-11-09",
                "birthday": "1988-10-10",
                "location": "irure",
                "post_qty": 6,
                "reply_qty": 11,
                "head_url": "http://xycegl.am/veqsmy"
            },
            "plate": {
                "id": 53,
                "name": "月须着记",
                "detail": "velit nulla nostrud enim",
                "post_qty": 21,
                "click_qty": 94,
                "plate_image": "http://dummyimage.com/400x400"
            },
            "up_qty": 43
        }
    ],
    "comments": [
        {
            "id": 44,
            "content": "irure labore do",
            "date_time": "1994-05-05 09:45:02",
            "up_qty": 65,
            "user": {
                "role": 68,
                "name": "起识世千除",
                "id": 33,
                "password": "ipsum aliquip culpa do eiusmod",
                "sex": "女",
                "record_date": "2009-12-06",
                "birthday": "1983-04-22",
                "location": "amet commodo esse",
                "post_qty": 25,
                "reply_qty": 46,
                "head_url": "http://lszbtod.中国互联.网络/iirsony"
            },
            "post": {
                "id": 49,
                "title": "族长都习调",
                "content": "cillum Ut tempor",
                "date_time": "1978-08-10 13:36:21",
                "click_qty": 36,
                "reply_qty": 34,
                "user": {
                    "role": 46,
                    "name": "土三千",
                    "id": 60,
                    "password": "do",
                    "sex": "男",
                    "record_date": "1984-05-01",
                    "birthday": "2014-08-08",
                    "location": "occaecat ad",
                    "post_qty": 62,
                    "reply_qty": 31,
                    "head_url": "http://qbcq.mn/bampjmc"
                },
                "plate": {
                    "id": 55,
                    "name": "王造除因得",
                    "detail": "eiusmod sed",
                    "post_qty": 86,
                    "click_qty": 8,
                    "plate_image": "http://dummyimage.com/400x400"
                },
                "up_qty": 60
            }
        },
        {
            "id": 86,
            "content": "commodo quis sed non do",
            "date_time": "2005-03-15 19:39:20",
            "up_qty": 16,
            "user": {
                "role": 97,
                "name": "代式一才报往参",
                "id": 38,
                "password": "deserunt id laboris sit dolor",
                "sex": "男",
                "record_date": "1983-01-31",
                "birthday": "1979-05-16",
                "location": "ex voluptate ut dolore adipisicing",
                "post_qty": 32,
                "reply_qty": 42,
                "head_url": "http://cbusbzsei.us/ujrxnj"
            },
            "post": {
                "id": 39,
                "title": "系接个位",
                "content": "ad consectetur est officia dolore",
                "date_time": "1978-02-09 01:40:13",
                "click_qty": 34,
                "reply_qty": 7,
                "user": {
                    "role": 53,
                    "name": "但位个论看眼",
                    "id": 14,
                    "password": "aliquip in dolore amet",
                    "sex": "男",
                    "record_date": "1977-10-15",
                    "birthday": "1990-04-18",
                    "location": "proident qui",
                    "post_qty": 58,
                    "reply_qty": 1,
                    "head_url": "http://kdustx.so/vqppatrhe"
                },
                "plate": {
                    "id": 82,
                    "name": "先究张第指林",
                    "detail": "adipisicing occaecat in",
                    "post_qty": 60,
                    "click_qty": 6,
                    "plate_image": "http://dummyimage.com/400x400"
                },
                "up_qty": 66
            }
        },
        {
            "id": 12,
            "content": "do est",
            "date_time": "2010-10-08 20:05:26",
            "up_qty": 55,
            "user": {
                "role": 64,
                "name": "运把利道权",
                "id": 74,
                "password": "in magna irure in",
                "sex": "女",
                "record_date": "2000-12-16",
                "birthday": "2003-06-13",
                "location": "Lorem",
                "post_qty": 92,
                "reply_qty": 91,
                "head_url": "http://qgpkldbtml.nr/ajdnmcd"
            },
            "post": {
                "id": 63,
                "title": "那指级广位华",
                "content": "Duis et Lorem",
                "date_time": "2005-12-15 08:22:55",
                "click_qty": 99,
                "reply_qty": 38,
                "user": {
                    "role": 89,
                    "name": "各权从感",
                    "id": 98,
                    "password": "commodo dolore non cupidatat",
                    "sex": "男",
                    "record_date": "1993-05-13",
                    "birthday": "2012-07-20",
                    "location": "velit Lorem adipisicing consectetur nulla",
                    "post_qty": 92,
                    "reply_qty": 72,
                    "head_url": "http://wrjor.mz/fggs"
                },
                "plate": {
                    "id": 32,
                    "name": "酸周点风会进设",
                    "detail": "sint aute",
                    "post_qty": 58,
                    "click_qty": 64,
                    "plate_image": "http://dummyimage.com/400x400"
                },
                "up_qty": 17
            }
        },
        {
            "id": 59,
            "content": "sint ullamco",
            "date_time": "2006-06-13 18:17:52",
            "up_qty": 83,
            "user": {
                "role": 64,
                "name": "则图了图群",
                "id": 93,
                "password": "in reprehenderit anim",
                "sex": "男",
                "record_date": "2000-04-16",
                "birthday": "1979-05-14",
                "location": "deserunt laborum",
                "post_qty": 65,
                "reply_qty": 58,
                "head_url": "http://pcyawbg.cn/oqzn"
            },
            "post": {
                "id": 10,
                "title": "元青少如制府记",
                "content": "aliqua mollit tempor laboris",
                "date_time": "2019-10-30 11:40:15",
                "click_qty": 34,
                "reply_qty": 98,
                "user": {
                    "role": 45,
                    "name": "眼形半林",
                    "id": 75,
                    "password": "nulla",
                    "sex": "女",
                    "record_date": "1972-07-26",
                    "birthday": "1974-10-19",
                    "location": "ullamco Lorem dolor ut laboris",
                    "post_qty": 14,
                    "reply_qty": 51,
                    "head_url": "http://tjiual.np/wwbwubakm"
                },
                "plate": {
                    "id": 76,
                    "name": "率候处青义团",
                    "detail": "cillum culpa consectetur est enim",
                    "post_qty": 73,
                    "click_qty": 46,
                    "plate_image": "http://dummyimage.com/400x400"
                },
                "up_qty": 60
            }
        },
        {
            "id": 82,
            "content": "deserunt in in dolore",
            "date_time": "2023-02-28 12:24:04",
            "up_qty": 86,
            "user": {
                "role": 17,
                "name": "下反期公完调",
                "id": 32,
                "password": "pariatur magna",
                "sex": "女",
                "record_date": "2018-10-13",
                "birthday": "2020-11-09",
                "location": "id tempor ea dolor nostrud",
                "post_qty": 7,
                "reply_qty": 12,
                "head_url": "http://vauedfjv.tk/sjbxnuayqu"
            },
            "post": {
                "id": 2,
                "title": "写商活",
                "content": "in consequat esse aliqua",
                "date_time": "2012-07-22 21:28:06",
                "click_qty": 30,
                "reply_qty": 8,
                "user": {
                    "role": 40,
                    "name": "者京此",
                    "id": 31,
                    "password": "et ad ex eu",
                    "sex": "男",
                    "record_date": "2002-02-08",
                    "birthday": "1976-09-17",
                    "location": "do Duis aliqua",
                    "post_qty": 8,
                    "reply_qty": 64,
                    "head_url": "http://bqksxs.wf/ztlwbu"
                },
                "plate": {
                    "id": 89,
                    "name": "离无边东",
                    "detail": "occaecat",
                    "post_qty": 76,
                    "click_qty": 78,
                    "plate_image": "http://dummyimage.com/400x400"
                },
                "up_qty": 45
            }
        }
    ],
    "resp": {
        "msg": "officia",
        "status": 200
    }
})
const activity=Mock.mock('http://localhost:8080/activity/findall','get',[
    {
        "id": 26,
        "title": "步八且在机",
        "content": "tempor qui Excepteur",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1970-10-02 20:12:52",
        "num_required": 94,
        "num_participants": 85,
        "state": 73,
        "user": {
            "role": 6,
            "name": "今易示六",
            "id": 92,
            "password": "sed labore dolore",
            "sex": "男",
            "record_date": "2012-11-12",
            "birthday": "1978-08-19",
            "location": "ad",
            "post_qty": 72,
            "reply_qty": 59,
            "head_url": "http://cquqoyr.sg/cyhffwcn"
        }
    },
    {
        "id": 41,
        "title": "给间都阶斗",
        "content": "labore",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1991-05-07 10:40:56",
        "num_required": 86,
        "num_participants": 90,
        "state": 52,
        "user": {
            "role": 4,
            "name": "资气导光研",
            "id": 66,
            "password": "anim Ut deserunt Duis",
            "sex": "女",
            "record_date": "1991-09-12",
            "birthday": "1999-05-23",
            "location": "eu in laborum",
            "post_qty": 55,
            "reply_qty": 93,
            "head_url": "http://euhsdzy.as/mafkxxv"
        }
    },
    {
        "id": 92,
        "title": "务书太至月育目",
        "content": "ea",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1973-12-09 07:31:37",
        "num_required": 38,
        "num_participants": 91,
        "state": 14,
        "user": {
            "role": 87,
            "name": "论做她管提",
            "id": 77,
            "password": "ut",
            "sex": "女",
            "record_date": "2014-04-19",
            "birthday": "1972-06-02",
            "location": "elit nulla in consequat dolor",
            "post_qty": 45,
            "reply_qty": 1,
            "head_url": "http://chpjm.ae/roocwzkg"
        }
    },
    {
        "id": 92,
        "title": "务书太至月育目",
        "content": "ea",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1973-12-09 07:31:37",
        "num_required": 38,
        "num_participants": 91,
        "state": 14,
        "user": {
            "role": 87,
            "name": "论做她管提",
            "id": 77,
            "password": "ut",
            "sex": "女",
            "record_date": "2014-04-19",
            "birthday": "1972-06-02",
            "location": "elit nulla in consequat dolor",
            "post_qty": 45,
            "reply_qty": 1,
            "head_url": "http://chpjm.ae/roocwzkg"
        }
    },
    {
        "id": 92,
        "title": "务书太至月育目",
        "content": "ea",
        "activity_image": "http://dummyimage.com/400x400",
        "date_time": "1973-12-09 07:31:37",
        "num_required": 38,
        "num_participants": 91,
        "state": 14,
        "user": {
            "role": 87,
            "name": "论做她管提",
            "id": 77,
            "password": "ut",
            "sex": "女",
            "record_date": "2014-04-19",
            "birthday": "1972-06-02",
            "location": "elit nulla in consequat dolor",
            "post_qty": 45,
            "reply_qty": 1,
            "head_url": "http://chpjm.ae/roocwzkg"
        }
    }
])
const testData=Mock.mock('http://localhost:8080/user/login','get',
{
    "resp": {
    "msg": "200",
        "status": 200
},
    "user": {
    "role": 0,
        "name": "科头程度",
        "id": 56,
        "password": "consectetur",
        "sex": "男",
        "record_date": "2014-05-13",
        "birthday": "2020-12-13",
        "location": "ea",
        "post_qty": 69,
        "reply_qty": 79,
        "head_image": "http://dummyimage.com/400x400"

}

})
const post =Mock.mock('http://localhost:8080/post/postDetail','get',{
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
const plate=Mock.mock('http://localhost:8080/plate/findall','get',[
        {
            "id": 78,
            "name": "集议么门转切重",
            "detail": "ad elit dolore",
            "post_qty": 25,
            "click_qty": 79,
            "plate_image": "http://dummyimage.com/400x400"
        },
        {
            "id": 40,
            "name": "增干导龙满",
            "detail": "dolor",
            "post_qty": 39,
            "click_qty": 13,
            "plate_image": "http://dummyimage.com/400x400"
        },
        {
            "id": 23,
            "name": "知近历制",
            "detail": "esse",
            "post_qty": 87,
            "click_qty": 39,
            "plate_image": "http://dummyimage.com/400x400"
        }
    ]
)
const plates=Mock.mock("http://localhost:8080/plate/plateDetails",'get',{
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