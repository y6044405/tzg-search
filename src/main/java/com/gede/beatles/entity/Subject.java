package com.gede.beatles.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private java.lang.Integer id;
    /**
     * iprojectId
     */
    private Integer           iprojectId;
    /**
     * linjie 新增字段iProjectCategyID
     */
    private Integer           iProjectCategyID;     //
    /**
     * linjie 新增字段-项目风险等级
     */
    private String            vcProjectRiskGrade;
    /**
     * linjie 新增字段-项目风险提示
     */
    private String            vcRiskHits;

    private String           projectName;              // 项目名称
    private String           projectCode;              // 项目编码
    private String           projectType;              // 项目类型 00 : 抵押; 01 : 担保 ; 02 : 质押; 03 : 信用
    private Integer          iguaranteeId;             // 担保机构ID
    private Integer          borrowerType;             // 借款人类型
    private BigDecimal       projectNumTotalFinancing; // 项目融资金额
    /**
     * 标的名称
     */
    private java.lang.String vcName;

    private String subjectCode;

    /**
     * 标的概括
     */
    private java.lang.String  vcShortDesp;
    /**
     * iloginAccountId
     */
    private java.lang.Integer iloginAccountId;

    /**
     * 预计年利率
     */
    private BigDecimal numInterestRate;
    /**
     * 奖励年利率
     */
    private BigDecimal numRewardRate;

    /**额外利息（目前为利息券）*/
    private BigDecimal numOtherRate;

    /**
     * 管理费利率
     */
    private BigDecimal        numManagementRate;
    private String            totalRate;             // 利率总和
    /**
     * 融资金额
     */
    private BigDecimal        numTotalFinancing;
    private String            numTotalFinancingStr;  // 融资金额万元
    private String            numCanFinancingStr;    // 可募集金额
    /**
     * linjie-剩余可投金额
     */
    private BigDecimal        amountOfInvestment;
    /**
     * 1 -- T+0; 2 -- T+1;3 -- T+2; 4 -- T+3; 5 -- 结束时计息； 6 --满标计息(如果结束时未募集满，则已结束时计息为准。)；
     * 
     */
    private java.lang.Integer ivalueDateType;
    private String            ivalueDateTypeStr;
    /**
     * 递投金额
     */
    private BigDecimal        numDelivery;
    /**
     * 起投金额
     */
    private BigDecimal        numMinInvest;
    /**
     * 投资人单标最大可投资金额
     */
    private BigDecimal        numMaxInvest;
    /**
     * 平台服务费率
     */
    private BigDecimal        numPlatFormFee;
    /**
     * 1--募集总额的百分比； 2--年利率。(一年按365天算)
     */
    private java.lang.Integer iplatFormFeeType;
    /**
     * 保证金费率
     */
    private BigDecimal        numBond;
    /**
     * 1--募集总额的百分比； 2--年利率。
     */
    private java.lang.Integer ibondType;
    /**
     * 借款期限(天数)
     */
    private java.lang.Integer numPeriod;
    /**
     * 预告开始时间
     */
    private java.util.Date    dtTrailer;
    private java.lang.String  dtTrailerStr;
    /**
     * 募集开始时间
     */
    private java.util.Date    dtCollectStart;
    private java.lang.String  dtCollectStartStr;
    /**
     * 募集结束时间
     */
    private java.util.Date    dtCollectEnd;
    private java.lang.String  dtCollectEndStr;
    /**
     * 实际募集结束时间
     */
    private java.util.Date    dtActualCollectEnd;
    private java.lang.String  dtActualCollectEndStr;
    /**
     * 实际募集金额
     */
    private BigDecimal        numActualFinancing;
    /**
     * 募集金额 百分比
     */
    private int               percent;
    /**
     * 实际支付募集期利息
     */
    private BigDecimal        numActualExtraInterest;
    /**
     * 实际支付借款利息(不含募集期利息)
     */
    private BigDecimal        numActualInterest;
    /**
     * 1-- 新录入 2-- 待审核 3-- 退回 4--作废 5-- 审核通过 6-- 待预告 -----------与第三方交互
     * 7--处理中(与第三方交互中)； 8--处理失败（第三方处理失败）； 9。处理成功 ----------- 9-- 待开标 10-- 投标中
     * 11-- 还款中 12-- 结束
     */
    private java.lang.Integer istate;

    /**
     * 与项目的最终还款日期一致
     */
    private java.util.Date    dtRepayment;
    private java.lang.String  dtRepaymentStr;
    /**
     * 合同模板主键
     */
    private Integer           icontractId;
    /**
     * 下一期还款总额
     */
    private BigDecimal        numNextRepayAmount;
    /**
     * 下一期还款时间
     */
    private java.util.Date    dtNextRepay;
    private java.lang.String  dtNextRepayStr;
    /**
     * 该条记录第一次创建的时间。
     */
    private java.util.Date    dtCreate;
    private java.lang.String  dtCreateStr;
    /**
     * 该条记录修改时间
     */
    private java.util.Date    dtModify;
    private java.lang.String  dtModifyStr;
    /**
     * 当前审核等级
     */
    private java.lang.String  vcCurrentFlow;
    /**
     * 项目审核流程
     */
    private java.lang.String  vcApprovalFlow;
    /**
     * 融资模式 1-- 直融;2-- 债权转让
     */
    private java.lang.Integer imode;
    /**
     * 1 -- 到期还本付息；2 -- 每日付息到期还本；3 -- 每月付息到期还本；4 -- 等额本息。
     */
    private java.lang.Integer irepayMode;
    private String            irepayModeStr;

    /**
     * 1 -- 普通标；2 -- 新手标。
     */
    private java.lang.Integer itype;
    /**
     * 1 -- 显示 100% 2 -- 正常显示
     */
    private java.lang.Integer idisplayState;

    // 自旋次数
    private int spinTime = 3;

    private java.lang.Integer numTotalPeriod;
    private java.lang.Integer numCurrentPeriod;

    /**
     * 原始状态
     */
    private java.lang.Integer iornstate;

    /**
     * 贴现额
     */
    private BigDecimal numDiscount;

    private String vcAwardsDesp;

    /**
     * 借款人提现费率
     */
    private BigDecimal numWithdrawFee;
    private String     numWithdrawFeestr;

    /**
     * linjie 是否开启自动开标 1：是，0：否
     */
    private Integer       iIsAutoOpenSubject;
    /**
     * linjie 期限等级
     */
    private Integer       iSubjectPeriodGradeID;   //
    private String        iSubjectPeriodGradeName; //
    /**
     * linjie 标的置顶数
     */
    private Integer       iAutoOpenPriority;       //
    /**
    * linjie 自动开标募集期限
    */
    private Integer       iAutoOpenDay;
    /**
     * linjie 标的集合
     */
    private List<Subject> subList;

    private Integer    remind;
    /**多财标标准id*/
    private Integer    iInterestConfigID;
    /**是否使用利率券：1--使用；2--不使用；*/
    private Integer    iUseInterestTicket;
    /**债券转让日*/
    private Date       dtAssignmentOfDebt;
    private String     dtAssignmentOfDebtStr;
    /**协议利率*/
    private BigDecimal numAgreementInterestRate;

    /**使用可以使用红包(根据systemparam表红包配置以及iUseRedPacket字段确定，用于前端显示，不存在数据库里)，1可以，2不可以**/
    private Integer isUseRed;

    /**前台显示的利率*/
    private String     detailRate;
    /**前台显示的利率 多财低*/
    private String     detailRateLow;
    /**前台显示的利率 多财高*/
    private String     detailRateHigh;
    /**多财最多奖励利率**/
    private BigDecimal extraInterestRate;
    /**标的可以投资的vip等级*/
    private Integer    iVipid;
    /**标的可以投资的vip等级说明*/
    private String     vcVipExplain;
    /**是否有募集期利息0:无，1有*/
    private Integer    iIsHaveInterest;
    /**
     * linjie--是否可以使用现金券，1：可以，2：不可以
     */
    private Integer    iUseCashTicket;

    /**是否生成借款合同 , NULL 表示原来数据， 0不生成   1生成， 新标的这个字段为0*/
    private Integer iNeedContract;

    /**
     * 服务费收取方式:1--一次性\n 2--按月收取\n 3--按季收取
     * */
    private java.lang.Integer iCollectType;

    /**
     * 服务费计费方式:1--年化利率\n 2--借款金额百分比\n 3--固定金额
     * */
    private java.lang.Integer iChargingType;

    /**
     * 服务费：iChargingType-1 表示服务费年化利率,iChargingType-2服务费费率,iChargingType=3服务费
     * */
    private BigDecimal serviceValue;
    private String     serviceValueStr;

    /**
     * 合同签署日
     */
    private java.util.Date    dtAgreement;
    private java.lang.String  dtAgreementStr;
    /**
     * 信息服务协议子路径
     * */
    private java.lang.String  servicesubpath;
    /**
     * 是否收取服务费
     * */
    private java.lang.Integer iIsAutoOpenNumPlatFormFee;
    /**
     * 服务费收取方式--前台显示
     */
    private String            servicemessage;

    /**
     * 列表页是否展现选项 1展现 2不展现
     */
    private Integer iIsShowSplit;

    /**
     * 标签
     */
    private String vcLabel;

    /**
     * 是否使用红包(新建标的时设置) 1使用 2不使用
     */
    private Integer iUseRedPacket;

    /**
     * 是否使用优惠券 1使用 2不使用
     */
    private Integer iUseCoupon;

    /**
     * 新客专享标显示红包利率信息
     */
    private String redRateMessage;

    /**
     * 是否可转让 1 可转让 　2不可转让
     */
    private Integer isTransferable;

    /**
     * 福利标描述
     */
    private String activeExplain;

    /**
     * 第一期还款时间
     */
    private java.util.Date   dtFirstRepay;
    private java.lang.String dtFirstRepayStr;

    /**
     * 是否允许提前还款
     */
    private Integer iCanPrepaid;

    /**
     * 指定投资人
     */
    private String vcSpecifiedAccount;

    /**
     * 提前还款前原计划还款时间
     */
    private java.util.Date dtOriginalPlanRepayment;
    /**
     * 资产类型 1=P2P;2=金交所
     * @author:  wk 
     * @return
     */
    private Integer        sourceAssetType;
    /**
     * 挂牌交易所
     * @author:  wk 
     * @return
     */
    private String         stockExchange;

    /** 掌薪计划ID */
    private Integer salaryPoolId;

    /** 存管资产类型 1=P2P;2=金交所 */
    private Integer cgAssetType;

    /** 金交所编号*/
    private String jjsCode;

    public List<Subject> getSubList() {
        return subList;
    }

    public void setSubList(List<Subject> subList) {
        this.subList = subList;
    }

    public String getNumWithdrawFeestr() {
        return numWithdrawFeestr;
    }

    public void setNumWithdrawFeestr(BigDecimal numWithdrawFee) {
        if (numWithdrawFee != null) {
            this.numWithdrawFeestr = numWithdrawFee.multiply(BigDecimal.valueOf(100)).setScale(3, BigDecimal.ROUND_HALF_UP).toString();
        }
    }

    public BigDecimal getNumWithdrawFee() {
        return numWithdrawFee;
    }

    public void setNumWithdrawFee(BigDecimal numWithdrawFee) {
        this.numWithdrawFee = numWithdrawFee;
        setNumWithdrawFeestr(numWithdrawFee);
    }

    public int getSpinTime() {
        return spinTime;
    }

    public void setSpinTime(int spinTime) {
        this.spinTime = spinTime;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setId(java.lang.Integer value) {
        this.id = value;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setIprojectId(java.lang.Integer value) {
        this.iprojectId = value;
    }

    public java.lang.Integer getIprojectId() {
        return this.iprojectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setVcName(java.lang.String value) {
        this.vcName = value;
    }

    public java.lang.String getVcName() {
        return this.vcName;
    }

    public java.lang.String getVcShortDesp() {
        return vcShortDesp;
    }

    public void setVcShortDesp(java.lang.String vcShortDesp) {
        this.vcShortDesp = vcShortDesp;
    }

    public void setIloginAccountId(java.lang.Integer value) {
        this.iloginAccountId = value;
    }

    public java.lang.Integer getIloginAccountId() {
        return this.iloginAccountId;
    }

    public void setNumInterestRate(BigDecimal value) {
        this.numInterestRate = value;
    }

    public BigDecimal getNumInterestRate() {
        return this.numInterestRate;
    }

    public void setNumRewardRate(BigDecimal value) {
        this.numRewardRate = value;
    }

    public BigDecimal getNumRewardRate() {
        return this.numRewardRate;
    }

    public void setNumManagementRate(BigDecimal value) {
        this.numManagementRate = value;
    }

    public BigDecimal getNumManagementRate() {
        return this.numManagementRate;
    }

    public void setNumTotalFinancing(BigDecimal value) {
        this.numTotalFinancing = value;
    }

    public BigDecimal getNumTotalFinancing() {
        return this.numTotalFinancing;
    }

    public void setIvalueDateType(java.lang.Integer value) {
        this.ivalueDateType = value;
    }

    public java.lang.Integer getIvalueDateType() {
        return this.ivalueDateType;
    }

    public void setNumDelivery(BigDecimal value) {
        this.numDelivery = value;
    }

    public BigDecimal getNumDelivery() {
        return this.numDelivery;
    }

    public void setNumMinInvest(BigDecimal value) {
        this.numMinInvest = value;
    }

    public BigDecimal getNumMinInvest() {
        return this.numMinInvest;
    }

    public void setNumMaxInvest(BigDecimal value) {
        this.numMaxInvest = value;
    }

    public BigDecimal getNumMaxInvest() {
        return this.numMaxInvest;
    }

    public void setNumPlatFormFee(BigDecimal value) {
        this.numPlatFormFee = value;
    }

    public BigDecimal getNumPlatFormFee() {
        return this.numPlatFormFee;
    }

    public void setIplatFormFeeType(java.lang.Integer value) {
        this.iplatFormFeeType = value;
    }

    public java.lang.Integer getIplatFormFeeType() {
        return this.iplatFormFeeType;
    }

    public void setNumBond(BigDecimal value) {
        this.numBond = value;
    }

    public BigDecimal getNumBond() {
        return this.numBond;
    }

    public void setIbondType(java.lang.Integer value) {
        this.ibondType = value;
    }

    public java.lang.Integer getIbondType() {
        return this.ibondType;
    }

    public void setNumPeriod(java.lang.Integer value) {
        this.numPeriod = value;
    }

    public java.lang.Integer getNumPeriod() {
        return this.numPeriod;
    }

    public java.util.Date getDtTrailer() {
        return this.dtTrailer;
    }

    public java.lang.String getDtTrailerStr() {
        return this.dtTrailerStr;
    }

    public java.util.Date getDtCollectStart() {
        return this.dtCollectStart;
    }

    public java.lang.String getDtCollectStartStr() {
        return this.dtCollectStartStr;
    }

    public java.util.Date getDtCollectEnd() {
        return this.dtCollectEnd;
    }

    public java.lang.String getDtCollectEndStr() {
        return this.dtCollectEndStr;
    }

    public java.util.Date getDtActualCollectEnd() {
        return this.dtActualCollectEnd;
    }

    public java.lang.String getDtActualCollectEndStr() {
        return this.dtActualCollectEndStr;
    }

    public void setNumActualFinancing(BigDecimal value) {
        this.numActualFinancing = value;
    }

    public BigDecimal getNumActualFinancing() {
        return this.numActualFinancing;
    }

    public void setNumActualExtraInterest(BigDecimal value) {
        this.numActualExtraInterest = value;
    }

    public BigDecimal getNumActualExtraInterest() {
        return this.numActualExtraInterest;
    }

    public void setNumActualInterest(BigDecimal value) {
        this.numActualInterest = value;
    }

    public BigDecimal getNumActualInterest() {
        return this.numActualInterest;
    }

    public void setIstate(java.lang.Integer value) {
        this.istate = value;
    }

    public java.lang.Integer getIstate() {
        return this.istate;
    }

    public java.util.Date getDtRepayment() {
        return this.dtRepayment;
    }

    public java.lang.String getDtRepaymentStr() {
        return this.dtRepaymentStr;
    }

    public void setDtRepaymentStr(java.lang.String dtRepaymentStr) {
        this.dtRepaymentStr = dtRepaymentStr;
    }

    public Integer getIcontractId() {
        return icontractId;
    }

    public void setIcontractId(Integer icontractId) {
        this.icontractId = icontractId;
    }

    public void setNumNextRepayAmount(BigDecimal value) {
        this.numNextRepayAmount = value;
    }

    public BigDecimal getNumNextRepayAmount() {
        return this.numNextRepayAmount;
    }

    public java.util.Date getDtNextRepay() {
        return this.dtNextRepay;
    }

    public java.lang.String getDtNextRepayStr() {
        return this.dtNextRepayStr;
    }

    public java.util.Date getDtCreate() {
        return this.dtCreate;
    }

    public java.lang.String getDtCreateStr() {
        return this.dtCreateStr;
    }

    public void setVcCurrentFlow(java.lang.String value) {
        this.vcCurrentFlow = value;
    }

    public java.lang.String getVcCurrentFlow() {
        return this.vcCurrentFlow;
    }

    public void setVcApprovalFlow(java.lang.String value) {
        this.vcApprovalFlow = value;
    }

    public java.lang.String getVcApprovalFlow() {
        return this.vcApprovalFlow;
    }

    public java.lang.Integer getImode() {
        return imode;
    }

    public void setImode(java.lang.Integer imode) {
        this.imode = imode;
    }

    public java.lang.Integer getIrepayMode() {
        return irepayMode;
    }

    public void setIrepayMode(java.lang.Integer irepayMode) {
        this.irepayMode = irepayMode;
    }

    public java.lang.Integer getItype() {
        return itype;
    }

    public void setItype(java.lang.Integer itype) {
        this.itype = itype;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getIvalueDateTypeStr() {
        return ivalueDateTypeStr;
    }

    public void setIvalueDateTypeStr(String ivalueDateTypeStr) {
        this.ivalueDateTypeStr = ivalueDateTypeStr;
    }

    public String getIrepayModeStr() {
        return irepayModeStr;
    }

    public void setIrepayModeStr(String irepayModeStr) {
        this.irepayModeStr = irepayModeStr;
    }

    public String getNumTotalFinancingStr() {
        return numTotalFinancingStr;
    }

    public void setNumTotalFinancingStr(String numTotalFinancingStr) {
        this.numTotalFinancingStr = numTotalFinancingStr;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(String totalRate) {
        this.totalRate = totalRate;
    }

    public Integer getIguaranteeId() {
        return iguaranteeId;
    }

    public void setIguaranteeId(Integer iguaranteeId) {
        this.iguaranteeId = iguaranteeId;
    }

    public java.lang.Integer getIornstate() {
        return iornstate;
    }

    public void setIornstate(java.lang.Integer iornstate) {
        this.iornstate = iornstate;
    }

    public String getNumCanFinancingStr() {
        return numCanFinancingStr;
    }

    public void setNumCanFinancingStr(String numCanFinancingStr) {
        this.numCanFinancingStr = numCanFinancingStr;
    }

    public java.lang.Integer getIdisplayState() {
        return idisplayState;
    }

    public void setIdisplayState(java.lang.Integer idisplayState) {
        this.idisplayState = idisplayState;
    }

    public java.lang.Integer getNumTotalPeriod() {
        return numTotalPeriod;
    }

    public void setNumTotalPeriod(java.lang.Integer numTotalPeriod) {
        this.numTotalPeriod = numTotalPeriod;
    }

    public java.lang.Integer getNumCurrentPeriod() {
        return numCurrentPeriod;
    }

    public void setNumCurrentPeriod(java.lang.Integer numCurrentPeriod) {
        this.numCurrentPeriod = numCurrentPeriod;
    }

    public Integer getBorrowerType() {
        return borrowerType;
    }

    public void setBorrowerType(Integer borrowerType) {
        this.borrowerType = borrowerType;
    }

    public BigDecimal getProjectNumTotalFinancing() {
        return projectNumTotalFinancing;
    }

    public void setProjectNumTotalFinancing(BigDecimal projectNumTotalFinancing) {
        this.projectNumTotalFinancing = projectNumTotalFinancing;
    }

    public BigDecimal getNumDiscount() {
        return numDiscount;
    }

    public void setNumDiscount(BigDecimal numDiscount) {
        this.numDiscount = numDiscount;
    }

    public String getVcAwardsDesp() {
        return vcAwardsDesp;
    }

    public void setVcAwardsDesp(String vcAwardsDesp) {
        this.vcAwardsDesp = vcAwardsDesp;
    }

    public Integer getiIsAutoOpenSubject() {
        return iIsAutoOpenSubject;
    }

    public void setiIsAutoOpenSubject(Integer iIsAutoOpenSubject) {
        this.iIsAutoOpenSubject = iIsAutoOpenSubject;
    }

    public Integer getiSubjectPeriodGradeID() {
        return iSubjectPeriodGradeID;
    }

    public void setiSubjectPeriodGradeID(Integer iSubjectPeriodGradeID) {
        this.iSubjectPeriodGradeID = iSubjectPeriodGradeID;
    }

    public Integer getiProjectCategyID() {
        return iProjectCategyID;
    }

    public void setiProjectCategyID(Integer iProjectCategyID) {
        this.iProjectCategyID = iProjectCategyID;
    }

    public Integer getiAutoOpenPriority() {
        return iAutoOpenPriority;
    }

    public void setiAutoOpenPriority(Integer iAutoOpenPriority) {
        this.iAutoOpenPriority = iAutoOpenPriority;
    }

    public String getiSubjectPeriodGradeName() {
        return iSubjectPeriodGradeName;
    }

    public void setiSubjectPeriodGradeName(String iSubjectPeriodGradeName) {
        this.iSubjectPeriodGradeName = iSubjectPeriodGradeName;
    }

    public java.util.Date getDtModify() {
        return dtModify;
    }

    public void setDtModify(java.util.Date dtModify) {
        this.dtModify = dtModify;
    }

    public java.lang.String getDtModifyStr() {
        return dtModifyStr;
    }

    /**
     * @Description: 为实现“普通标的自动上标”功能，需要判断“自动开标库中的每种产品和每种期限等级的标的”，
     *               线上是否都有，所以重写equals方法，如果“产品id”与“期限等级”相同，就认为这两个对象相同
     * @author linjie
     * @version 创建时间：2015年12月16日上午10:07:31
     */
    @Override
    public boolean equals(Object o) {
        boolean res = false;
        // 判断传进来的Object类型是否是Subjecct
        if (!(o instanceof Subject)) {
            return res;
        }
        Subject sub = (Subject) o;
        // 以“产品分类”和“期限等级”两个字段来判定两个对象是否相等
        if (sub.getiProjectCategyID() == iProjectCategyID && sub.getiSubjectPeriodGradeID() == iSubjectPeriodGradeID) {
            res = true;
        }
        return res;
    }

    /**
     * @Description: 为了增加equals的效率，重写hashcode方法，返回“产品分类”和“期限等级”的hashCode
     * @author linjie
     * @version 创建时间：2015年12月16日上午10:13:31
     */
    @Override
    public int hashCode() {
        int result = 17;
        if (iProjectCategyID == null) {
            iProjectCategyID = 0;
        }
        if (iSubjectPeriodGradeID == null) {
            iSubjectPeriodGradeID = 0;
        }
        result = 37 * result + iProjectCategyID.hashCode();
        result = 37 * result + iSubjectPeriodGradeID.hashCode();
        return result;
    }

    public BigDecimal getAmountOfInvestment() {
        return amountOfInvestment;
    }

    public void setAmountOfInvestment(BigDecimal amountOfInvestment) {
        this.amountOfInvestment = amountOfInvestment;
    }

    public Integer getIAutoOpenDay() {
        return iAutoOpenDay;
    }

    public void setIAutoOpenDay(Integer iAutoOpenDay) {
        this.iAutoOpenDay = iAutoOpenDay;
    }

    public BigDecimal getNumOtherRate() {
        return numOtherRate;
    }

    public void setNumOtherRate(BigDecimal numOtherRate) {
        this.numOtherRate = numOtherRate;
    }

    public Integer getiAutoOpenDay() {
        return iAutoOpenDay;
    }

    public void setiAutoOpenDay(Integer iAutoOpenDay) {
        this.iAutoOpenDay = iAutoOpenDay;
    }

    public Integer getRemind() {
        return remind;
    }

    public void setRemind(Integer remind) {
        this.remind = remind;
    }

    public Integer getiInterestConfigID() {
        return iInterestConfigID;
    }

    public void setiInterestConfigID(Integer iInterestConfigID) {
        this.iInterestConfigID = iInterestConfigID;
    }

    public Integer getiUseInterestTicket() {
        return iUseInterestTicket;
    }

    public void setiUseInterestTicket(Integer iUseInterestTicket) {
        this.iUseInterestTicket = iUseInterestTicket;
    }

    public Date getDtAssignmentOfDebt() {
        return dtAssignmentOfDebt;
    }

    public void setDtAssignmentOfDebt(Date dtAssignmentOfDebt) {
        this.dtAssignmentOfDebt = dtAssignmentOfDebt;
    }

    public String getDtAssignmentOfDebtStr() {
        return dtAssignmentOfDebtStr;
    }

    public void setDtAssignmentOfDebtStr(String dtAssignmentOfDebtStr) {
        this.dtAssignmentOfDebtStr = dtAssignmentOfDebtStr;
    }

    public BigDecimal getNumAgreementInterestRate() {
        return numAgreementInterestRate;
    }

    public void setNumAgreementInterestRate(BigDecimal numAgreementInterestRate) {
        this.numAgreementInterestRate = numAgreementInterestRate;
    }

    public Integer getIsUseRed() {
        return isUseRed;
    }

    public void setIsUseRed(Integer isUseRed) {
        this.isUseRed = isUseRed;
    }

    public String getDetailRate() {
        return detailRate;
    }

    public void setDetailRate(String detailRate) {
        this.detailRate = detailRate;
    }

    public String getDetailRateLow() {
        return detailRateLow;
    }

    public void setDetailRateLow(String detailRateLow) {
        this.detailRateLow = detailRateLow;
    }

    public String getDetailRateHigh() {
        return detailRateHigh;
    }

    public void setDetailRateHigh(String detailRateHigh) {
        this.detailRateHigh = detailRateHigh;
    }

    public BigDecimal getExtraInterestRate() {
        return extraInterestRate;
    }

    public void setExtraInterestRate(BigDecimal extraInterestRate) {
        this.extraInterestRate = extraInterestRate;
    }

    public void setDtActualCollectEndStr(java.lang.String dtActualCollectEndStr) {
        this.dtActualCollectEndStr = dtActualCollectEndStr;
    }

    public void setDtNextRepayStr(java.lang.String dtNextRepayStr) {
        this.dtNextRepayStr = dtNextRepayStr;
    }

    public void setDtCreateStr(java.lang.String dtCreateStr) {
        this.dtCreateStr = dtCreateStr;
    }

    public void setNumWithdrawFeestr(String numWithdrawFeestr) {
        this.numWithdrawFeestr = numWithdrawFeestr;
    }

    public Integer getiVipid() {
        return iVipid;
    }

    public void setiVipid(Integer iVipid) {
        this.iVipid = iVipid;
    }

    public Integer getiIsHaveInterest() {
        return iIsHaveInterest;
    }

    public void setiIsHaveInterest(Integer iIsHaveInterest) {
        this.iIsHaveInterest = iIsHaveInterest;
    }

    public Integer getiUseCashTicket() {
        return iUseCashTicket;
    }

    public void setiUseCashTicket(Integer iUseCashTicket) {
        this.iUseCashTicket = iUseCashTicket;
    }

    public String getVcVipExplain() {
        return vcVipExplain;
    }

    public void setVcVipExplain(String vcVipExplain) {
        this.vcVipExplain = vcVipExplain;
    }

    public String getVcProjectRiskGrade() {
        return vcProjectRiskGrade;
    }

    public void setVcProjectRiskGrade(String vcProjectRiskGrade) {
        this.vcProjectRiskGrade = vcProjectRiskGrade;
    }

    public String getVcRiskHits() {
        return vcRiskHits;
    }

    public void setVcRiskHits(String vcRiskHits) {
        this.vcRiskHits = vcRiskHits;
    }

    public Integer getiNeedContract() {
        return iNeedContract;
    }

    public void setiNeedContract(Integer iNeedContract) {
        this.iNeedContract = iNeedContract;
    }

    public java.util.Date getDtAgreement() {
        return dtAgreement;
    }

    public java.lang.String getDtAgreementStr() {
        return dtAgreementStr;
    }

    public java.lang.Integer getiIsAutoOpenNumPlatFormFee() {
        return iIsAutoOpenNumPlatFormFee;
    }

    public void setiIsAutoOpenNumPlatFormFee(java.lang.Integer iIsAutoOpenNumPlatFormFee) {
        this.iIsAutoOpenNumPlatFormFee = iIsAutoOpenNumPlatFormFee;
    }

    public String getServiceValueStr() {
        return serviceValueStr;
    }

    public void setServiceValueStr(String serviceValueStr) {
        this.serviceValueStr = serviceValueStr;
    }

    public java.lang.Integer getiCollectType() {
        return iCollectType;
    }

    public void setiCollectType(java.lang.Integer iCollectType) {
        this.iCollectType = iCollectType;
    }

    public java.lang.Integer getiChargingType() {
        return iChargingType;
    }

    public void setiChargingType(java.lang.Integer iChargingType) {
        this.iChargingType = iChargingType;
    }

    public BigDecimal getServiceValue() {
        return serviceValue;
    }

    public void setServiceValue(BigDecimal serviceValue) {
        this.serviceValue = serviceValue;
        this.serviceValueStr = serviceValue.toString();
    }

    public java.lang.String getServicesubpath() {
        return servicesubpath;
    }

    public void setServicesubpath(java.lang.String servicesubpath) {
        this.servicesubpath = servicesubpath;
    }

    public String getServicemessage() {
        return servicemessage;
    }

    public void setServicemessage(String servicemessage) {
        this.servicemessage = servicemessage;
    }

    public Integer getiIsShowSplit() {
        return iIsShowSplit;
    }

    public String getRedRateMessage() {
        return redRateMessage;
    }

    public void setiIsShowSplit(Integer iIsShowSplit) {
        this.iIsShowSplit = iIsShowSplit;
    }

    public String getVcLabel() {
        return vcLabel;
    }

    public void setVcLabel(String vcLabel) {
        this.vcLabel = vcLabel;
    }

    public Integer getiUseRedPacket() {
        return iUseRedPacket;
    }

    public void setiUseRedPacket(Integer iUseRedPacket) {
        this.iUseRedPacket = iUseRedPacket;
    }

    public Integer getiUseCoupon() {
        return iUseCoupon;
    }

    public void setiUseCoupon(Integer iUseCoupon) {
        this.iUseCoupon = iUseCoupon;
    }

    public void setRedRateMessage(String redRateMessage) {
        this.redRateMessage = redRateMessage;
    }

    public Integer getIsTransferable() {
        return isTransferable;
    }

    public void setIsTransferable(Integer isTransferable) {
        this.isTransferable = isTransferable;
    }

    public String getActiveExplain() {
        return activeExplain;
    }

    public void setActiveExplain(String activeExplain) {
        this.activeExplain = activeExplain;
    }

    public java.util.Date getDtFirstRepay() {
        return dtFirstRepay;
    }

    public java.lang.String getDtFirstRepayStr() {
        return dtFirstRepayStr;
    }

    public Integer getiCanPrepaid() {
        return iCanPrepaid;
    }

    public void setiCanPrepaid(Integer iCanPrepaid) {
        this.iCanPrepaid = iCanPrepaid;
    }

    public java.util.Date getDtOriginalPlanRepayment() {
        return dtOriginalPlanRepayment;
    }

    public void setDtOriginalPlanRepayment(java.util.Date dtOriginalPlanRepayment) {
        this.dtOriginalPlanRepayment = dtOriginalPlanRepayment;
    }

    public Integer getSalaryPoolId() {
        return salaryPoolId;
    }

    public void setSalaryPoolId(Integer salaryPoolId) {
        this.salaryPoolId = salaryPoolId;
    }

    public String getVcSpecifiedAccount() {
        return vcSpecifiedAccount;
    }

    public void setVcSpecifiedAccount(String vcSpecifiedAccount) {
        this.vcSpecifiedAccount = vcSpecifiedAccount;
    }

    public Integer getSourceAssetType() {
        return sourceAssetType;
    }

    public void setSourceAssetType(Integer sourceAssetType) {
        this.sourceAssetType = sourceAssetType;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public Integer getCgAssetType() {
        return cgAssetType;
    }

    public void setCgAssetType(Integer cgAssetType) {
        this.cgAssetType = cgAssetType;
    }

    public String getJjsCode() {
        return jjsCode;
    }

    public void setJjsCode(String jjsCode) {
        this.jjsCode = jjsCode;
    }

}
