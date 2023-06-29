<script setup>
import axios from "axios"

</script>


  <template>
    <div class="common-layout">
      <el-container>
        <el-header class="head">Header</el-header>
        <el-main   class="main" >
        <h1 class="title">加入我们，创造历史性的工作来帮助基因研究</h1>
          <div class="author">JR Frank
          <span class="date">-2023年6月31日</span>
          </div>
          <div class="content">
            <img src="../../IMG/TESTIMG.jpg" height="270" width="480">
            <div class="credit-container">
              <div class="location">San Diego,Texas</div>
            <div class="country">China</div>
            </div>
            <div class="article-body">

              <div class="container">
                <p class="quote">"The support from the San Diego Lions Club Welfare Foundation aids our research and helps us to better diagnose, prevent and treat eye diseases."</p>
                <p class="article">
                  希利眼科研究所医生和研究员们在治疗视网膜变异、青光眼、糖尿病性视网膜病变和其他原发性眼疾方面取得了可喜的发展。希望这里的发现对全球产生影响。未间断地对眼库标本研究中的一方面包括按生物地理血统来识别眼疾的生物标志物，了解标记如何适用于不同祖先的个体。
                </p>
              </div>
            </div>
          </div>
          <el-button type="success">Submit</el-button>
          <el-button plain disabled>Submit</el-button>
        </el-main>

      </el-container>

    </div>
  </template>


<style scoped>
.common-layout{
  background-color: #f6f6f6;
}
.head{
  text-align: center;
  background-color: aqua;
}
.main{
  text-align: center;
  background-color:#fff;
  width:60%;
  margin: 0 auto;
}
.title{
  font-size: 60px;
  line-height: 60px;
  letter-spacing: .5px;
  margin: 15px 0;
  font-family: "Helvetica Neue", Helvetica, "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "微软雅黑", Arial, sans-serif;

}
.author{
  color: #0a3dab;
  font-family: "Helvetica";
  font-size: 16px;
  line-height: 24px;
  letter-spacing: 1px;
  margin: 36px 0 60px;
  display: block;
}
.author span{
  color: black;
}
.date{
  margin: 0 5px;
}
body{
  text-rendering: auto;

}
.quote{
  font-family:"""JetBrains Mono Thin";
  font-size: 36px;
}
.article{
  font-size: 24px;
  line-height: 32px;
  letter-spacing: .2px;
}
button{
  display: inline-block;
  margin-top: 5vw;
}


</style>