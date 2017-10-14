package com.example.admin.finalprojtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.admin.finalprojtest.data.FinanceInfoClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FinanceInfoActivity extends AppCompatActivity {


    @BindView(R.id.etAddFinance_totalHours)
    EditText etAddFinanceTotalHours;
    @BindView(R.id.etAddFinance_overtimeHours)
    EditText etAddFinanceOvertimeHours;
    @BindView(R.id.etAddFinance_holidayHours)
    EditText etAddFinanceHolidayHours;
    @BindView(R.id.etAddFinance_pto)
    EditText etAddFinancePto;

    @BindView(R.id.etAddFinance_hourlyRate)
    EditText etAddFinanceHourlyRate;
    @BindView(R.id.etAddFinance_overtimeRate)
    EditText etAddFinanceOvertimeRate;

    @BindView(R.id.etAddFinance_federalTax)
    EditText etAddFinanceFederalTax;
    @BindView(R.id.etAddFinance_stateTax)
    EditText etAddFinanceStateTax;
    @BindView(R.id.etAddFinance_socialSecurityTax)
    EditText etAddFinanceSocialSecurityTax;
    @BindView(R.id.etAddFinance_medicareTax)
    EditText etAddFinanceMedicareTax;

    @BindView(R.id.etAddFinance_medicalInsurance)
    EditText etAddFinanceMedicalInsurance;
    @BindView(R.id.etAddFinance_visionInsurance)
    EditText etAddFinanceVisionInsurance;
    @BindView(R.id.etAddFinance_dentalInsurance)
    EditText etAddFinanceDentalInsurance;
    @BindView(R.id.etAddFinance_shortTermDisabilityInsurance)
    EditText etAddFinanceShortTermDisabilityInsurance;
    @BindView(R.id.etAddFinance_longTermDisabilityInsurance)
    EditText etAddFinanceLongTermDisabilityInsurance;
    @BindView(R.id.etAddFinance_lifeInsurance)
    EditText etAddFinanceLifeInsurance;

    @BindView(R.id.etAddFinance_dateFrom)
    EditText etAddFinanceDateFrom;
    @BindView(R.id.etAddFinance_dateTo)
    EditText etAddFinanceDateTo;
    @BindView(R.id.etAddFinance_payDate)
    EditText etAddFinancePayDate;

    @BindView(R.id.etAddFinance_expensePay)
    EditText etAddFinanceExpensesPay;
    @BindView(R.id.etAddFinance_advancePay)
    EditText etAddFinanceAdvancesPay;
    @BindView(R.id.etAddFinance_advanceDeduction)
    EditText etAddFinanceAdvancesDeduction;

    FinanceInfoClass financeInfoClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance_info_class);
        ButterKnife.bind(this);

    }

    public void addFinance(View view) {

        float totalHours = Float.valueOf(etAddFinanceTotalHours.getText().toString());
        float holidayHours = Float.valueOf(etAddFinanceHolidayHours.getText().toString());
        float ptoUsedHours = Float.valueOf(etAddFinancePto.getText().toString());
        float overtimeHours = Float.valueOf(etAddFinanceOvertimeHours.getText().toString());

        float hourlyRate = Float.valueOf(etAddFinanceHourlyRate.getText().toString());
        float overtimeRate = Float.valueOf(etAddFinanceOvertimeRate.getText().toString());

        float federalTax = Float.valueOf(etAddFinanceFederalTax.getText().toString());
        float stateTax = Float.valueOf(etAddFinanceStateTax.getText().toString());
        float socialSecurityTax = Float.valueOf(etAddFinanceSocialSecurityTax.getText().toString());
        float medicareTax = Float.valueOf(etAddFinanceMedicareTax.getText().toString());

        float medicalInsurance = Float.valueOf(etAddFinanceMedicalInsurance.getText().toString());
        float visionInsurance = Float.valueOf(etAddFinanceVisionInsurance.getText().toString());
        float dentalInsurance = Float.valueOf(etAddFinanceDentalInsurance.getText().toString());
        float shortTermDisabilityInsurance = Float.valueOf(etAddFinanceShortTermDisabilityInsurance.getText().toString());
        float longTermDisabilityInsurance = Float.valueOf(etAddFinanceLongTermDisabilityInsurance.getText().toString());
        float lifeInsurance = Float.valueOf(etAddFinanceLifeInsurance.getText().toString());

        float expensesPay = Float.valueOf(etAddFinanceExpensesPay.getText().toString());
        float advancesPay = Float.valueOf(etAddFinanceAdvancesPay.getText().toString());
        float advancesDeduction = Float.valueOf(etAddFinanceAdvancesDeduction.getText().toString());

        SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");

        Date dateFrom = null;
        try {
            dateFrom = df.parse(etAddFinanceDateFrom.getText().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date dateTo = null;
        try {
            dateTo = df.parse(etAddFinanceDateFrom.getText().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date payDate = null;
        try {
            payDate = df.parse(etAddFinanceDateFrom.getText().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }


        financeInfoClass = new FinanceInfoClass(totalHours, holidayHours, ptoUsedHours, overtimeHours,
                hourlyRate, overtimeRate,
                federalTax, stateTax, socialSecurityTax, medicareTax,
                medicalInsurance, visionInsurance, dentalInsurance,
                shortTermDisabilityInsurance, longTermDisabilityInsurance, lifeInsurance,
                dateFrom, dateTo, payDate,
                expensesPay, advancesPay, advancesDeduction,
                getTotalPay(), getTotalGrossHours(), getTotalGrossPay());

    }

    float getTotalPay() {

        float totalPay;

        float totalHours = Float.valueOf(etAddFinanceTotalHours.getText().toString());
        float holidayHours = Float.valueOf(etAddFinanceHolidayHours.getText().toString());
        float ptoUsedHours = Float.valueOf(etAddFinancePto.getText().toString());
        float overtimeHours = Float.valueOf(etAddFinanceOvertimeHours.getText().toString());

        float hourlyRate = Float.valueOf(etAddFinanceHourlyRate.getText().toString());
        float overtimeRate = Float.valueOf(etAddFinanceOvertimeRate.getText().toString());

        float federalTax = Float.valueOf(etAddFinanceFederalTax.getText().toString());
        float stateTax = Float.valueOf(etAddFinanceStateTax.getText().toString());
        float socialSecurityTax = Float.valueOf(etAddFinanceSocialSecurityTax.getText().toString());
        float medicareTax = Float.valueOf(etAddFinanceMedicareTax.getText().toString());

        float medicalInsurance = Float.valueOf(etAddFinanceMedicalInsurance.getText().toString());
        float visionInsurance = Float.valueOf(etAddFinanceVisionInsurance.getText().toString());
        float dentalInsurance = Float.valueOf(etAddFinanceDentalInsurance.getText().toString());
        float shortTermDisabilityInsurance = Float.valueOf(etAddFinanceShortTermDisabilityInsurance.getText().toString());
        float longTermDisabilityInsurance = Float.valueOf(etAddFinanceLongTermDisabilityInsurance.getText().toString());
        float lifeInsurance = Float.valueOf(etAddFinanceLifeInsurance.getText().toString());

        float expensesPay = Float.valueOf(etAddFinanceExpensesPay.getText().toString());
        float advancesPay = Float.valueOf(etAddFinanceAdvancesPay.getText().toString());
        float advancesDeduction = Float.valueOf(etAddFinanceAdvancesDeduction.getText().toString());

        totalPay = (totalHours + holidayHours + ptoUsedHours) * hourlyRate
                + (overtimeRate * overtimeHours)
                - federalTax - stateTax - socialSecurityTax - medicareTax
                - medicalInsurance - visionInsurance - dentalInsurance
                - shortTermDisabilityInsurance - longTermDisabilityInsurance
                - lifeInsurance
                + expensesPay + advancesPay - advancesDeduction;

        return totalPay;
    }

    float getTotalGrossPay() {

        float totalGrossPay;

        float totalHours = Float.valueOf(etAddFinanceTotalHours.getText().toString());
        float holidayHours = Float.valueOf(etAddFinanceHolidayHours.getText().toString());
        float ptoUsedHours = Float.valueOf(etAddFinancePto.getText().toString());
        float overtimeHours = Float.valueOf(etAddFinanceOvertimeHours.getText().toString());

        float hourlyRate = Float.valueOf(etAddFinanceHourlyRate.getText().toString());
        float overtimeRate = Float.valueOf(etAddFinanceOvertimeRate.getText().toString());

        float expensesPay = Float.valueOf(etAddFinanceExpensesPay.getText().toString());
        float advancesPay = Float.valueOf(etAddFinanceAdvancesPay.getText().toString());


        totalGrossPay = (totalHours + holidayHours + ptoUsedHours) * hourlyRate
                + (overtimeRate * overtimeHours)
                + expensesPay + advancesPay;

        return totalGrossPay;
    }

    float getTotalGrossHours() {

        float totalGrossHours;

        float totalHours = Float.valueOf(etAddFinanceTotalHours.getText().toString());
        float holidayHours = Float.valueOf(etAddFinanceHolidayHours.getText().toString());
        float ptoUsedHours = Float.valueOf(etAddFinancePto.getText().toString());
        float overtimeHours = Float.valueOf(etAddFinanceOvertimeHours.getText().toString());


        totalGrossHours = totalHours + holidayHours + ptoUsedHours + overtimeHours;

        return totalGrossHours;
    }
}
