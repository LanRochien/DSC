import Mock from 'mockjs'
const login =Mock.mock('http://localhost:8080/test/?username=qwe&password=qwe ','post',function (req){

    return body
})
const testData=Mock.mock('http://localhost:8080/test','get',{
    name:"Lanxxx",
    id:1

})
const post =Mock.mock('http://localhost:8080/post','get',{
    "post_id": 55,
    "title": "这区想不质",
    "post_image": "http://dummyimage.com/400x400",
    "content": "irure exercitation proident",
    "datetime": "1989-09-22 03:50:32",
    "click_qty": 77,
    "reply_qty": 39,
    "commentlist": [
        {
            "id": 93,
            "content": "magna anim Excepteur",
            "datetime": "1978-10-09 16:44:41",
            "up_qty": 79,
            "user": {
                "role": 11,
                "name": "设称管",
                "id": 76,
                "password": "pariatur enim dolore cillum",
                "sex": "女",
                "record_date": "1974-09-28",
                "birthday": "2012-10-25",
                "location": "culpa dolor est magna tempor",
                "post_num": 38,
                "reply_num": 65,
                "head_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 84,
            "content": "enim commodo ullamco",
            "datetime": "1987-05-28 07:49:35",
            "up_qty": 14,
            "user": {
                "role": 92,
                "name": "话论好切书",
                "id": 88,
                "password": "Ut",
                "sex": "男",
                "record_date": "1991-04-29",
                "birthday": "2020-05-15",
                "location": "quis",
                "post_num": 17,
                "reply_num": 11,
                "head_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 45,
            "content": "in ut",
            "datetime": "1977-01-09 13:44:50",
            "up_qty": 13,
            "user": {
                "role": 40,
                "name": "安资过越很声达",
                "id": 47,
                "password": "eu",
                "sex": "男",
                "record_date": "2006-06-12",
                "birthday": "1993-03-22",
                "location": "ipsum",
                "post_num": 49,
                "reply_num": 35,
                "head_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 75,
            "content": "veniam magna",
            "datetime": "1991-07-16 16:57:20",
            "up_qty": 94,
            "user": {
                "role": 6,
                "name": "状系内经律",
                "id": 15,
                "password": "ipsum irure quis Excepteur",
                "sex": "男",
                "record_date": "1985-05-28",
                "birthday": "2005-08-28",
                "location": "sit veniam in ipsum",
                "post_num": 97,
                "reply_num": 2,
                "head_image": "http://dummyimage.com/400x400"
            }
        },
        {
            "id": 11,
            "content": "sit occaecat",
            "datetime": "2011-02-14 23:27:10",
            "up_qty": 27,
            "user": {
                "role": 47,
                "name": "干各同则",
                "id": 25,
                "password": "in",
                "sex": "男",
                "record_date": "2008-01-09",
                "birthday": "2018-08-22",
                "location": "est aute irure sit",
                "post_num": 39,
                "reply_num": 11,
                "head_image": "http://dummyimage.com/400x400"
            }
        }
    ],
    "user": {
        "role": 36,
        "name": "断把身化",
        "id": 5,
        "password": "ut et proident magna amet",
        "sex": "女",
        "record_date": "1986-04-20",
        "birthday": "1995-09-28",
        "location": "dolor enim dolor proident",
        "post_num": 20,
        "reply_num": 30,
        "head_image": "http://dummyimage.com/400x400"
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

    plate_id: 23,
    plate_name: "决美导备办引",
    explain: "reprehenderit velit aute in sint",
    post_qty: 67,
    click_qty: 53,
    plate_image: "http://dummyimage.com/400x400",
    posts: [
    {
        post_id: 73,
        title: "海统形装格争得",
        post_image: "http://dummyimage.com/400x400",
        content: "ex",
        datetime: "1990-04-22 07:45:49",
        click_qty: 78,
        reply_qty: 44,
        role: 26,
        user:{
            id: 17,
            name: "劳时真",
        },
        password: "aliquip dolore",
        sex: "男",
        record_date: "1994-08-16",
        birthday: "1986-08-22",
        location: "officia aliqua",
        ban_tag: 20,
        post_num: "71",
        reply_num: "96",
        vol_tag: 88,
        head_image: "http://dummyimage.com/400x400"
    },
    {
        post_id: 94,
        title: "验入作只意和式",
        post_image: "http://dummyimage.com/400x400",
        content: "elit reprehenderit dolore",
        datetime: "1970-11-07 17:35:34",
        click_qty: 96,
        reply_qty: 90,
        role: 70,
        user:{
            id: 9,
            name: "研你建量办利",
        },
        password: "mollit",
        sex: "女",
        record_date: "1979-07-19",
        birthday: "2011-08-30",
        location: "pariatur mollit ipsum laborum id",
        ban_tag: 82,
        post_num: "60",
        reply_num: "15",
        vol_tag: 2,
        head_image: "http://dummyimage.com/400x400"
    },
    {
        post_id: 88,
        title: "天值数",
        post_image: "http://dummyimage.com/400x400",
        content: "officia consequat Excepteur anim",
        datetime: "1976-07-24 07:48:19",
        click_qty: 52,
        reply_qty: 72,
        role: 83,
        user:{
            id: 39,
            name: "同民团写心品矿",
        },
        password: "occaecat dolor nisi deserunt",
        sex: "女",
        record_date: "1985-09-24",
        birthday: "1991-10-07",
        location: "sint magna nisi culpa",
        ban_tag: 34,
        post_num: "99",
        reply_num: "19",
        vol_tag: 88,
        head_image: "http://dummyimage.com/400x400"
    }
]

})