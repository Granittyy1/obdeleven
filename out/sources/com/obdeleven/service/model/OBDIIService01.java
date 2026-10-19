package com.obdeleven.service.model;

import Z3.o;
import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.obdeleven.service.util.Texttabe;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;
import p109i8.j;
import p134k8.T1;

/* JADX INFO: loaded from: classes3.dex */
public enum OBDIIService01 implements j {
    f29401b("SUPPORTED_PIDS_0", "00"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("STATUS_SINCE_DTC_CLEARING", "01"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("FREEZE_DTC", "02"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("FUEL_SYSTEM_STATUS", "03"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("ENGINE_LOAD", "04"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("ENGINE_COOLANT_TEMP", "05"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("SHORT_TERM_FUEL_TRIM_BANK_1", "06"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("LONG_TERM_FUEL_TRIM_BANK_1", "07"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("SHORT_TERM_FUEL_TRIM_BANK_2", "08"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("LONG_TERM_FUEL_TRIM_BANK_2", "09"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("FUEL_PRESSURE", "0A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("INTAKE_MANIFOLD_PRESSURE", "0B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("ENGINE_RPM", "0C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("VEHICLE_SPEED", "0D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("TIMING_ADVANCE", "0E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("INTAKE_AIR_TEMPERATURE", "0F"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("MAF_AIR_FLOW_RATE", "10"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("THROTTLE_POSITION", "11"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("SECONDARY_AIR_STATUS", "12"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_PRESENT_2", "13"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_1", "14"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_2", "15"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_3", "16"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_4", "17"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_5", "18"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_6", "19"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_7", "1A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_VOLTAGE_AND_FUEL_TRIM_8", "1B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("SUPPORTED_OBD_STANDARTS", "1C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_PRESENT_4", "1D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("AUX_STATUS", "1E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ENGINE_RUNTIME", "1F"),
    f29402c("SUPPORTED_PIDS_20", "20"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("DISTANCE_WITH_MALFUNCTION", "21"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("FUEL_RAIL_PRESSURE", "22"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("FUEL_RAIL_GAUGE_PRESSURE", "23"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_1", "24"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_2", "25"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_3", "26"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_4", "27"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_5", "28"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_6", "29"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_7", "2A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_AND_VOLTAGE_8", "2B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("COMMANDED_EGR", "2C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EGR_ERROR", "2D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("COMMANDED_EVAPORATIVE_PURGE", "2E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("FUEL_TANK_LEVEL_INPUT", "2F"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("WARM_UPS_SINCE_CODES_CLEARED", "30"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("DISTANCE_TRAVELED_SINCE_CODES_CLEARED", "31"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("EVAPORATIVE_SYSTEM_PRESSURE", "32"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ABSOLUTE_BAROMETRIC_PRESSURE", "33"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_1", "34"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_2", "35"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_3", "36"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_4", "37"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_5", "38"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_6", "39"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_7", "3A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("OXYGEN_SENSOR_FUEL_AIR_RATIO_ANT_CURRENT_8", "3B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("CATALYST_TEMP_BANK_1_SENSOR_1", "3C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("CATALYST_TEMP_BANK_2_SENSOR_1", "3D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("CATALYST_TEMP_BANK_1_SENSOR_2", "3E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("CATALYST_TEMP_BANK_2_SENSOR_2", "3F"),
    f29403d("SUPPORTED_PIDS_40", "40"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("MONITOR_STATUS_THIS_DRIVE_CYCLE", "41"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("CONTROL_MODULE_VOLTAGE", "42"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ABSOLUTE_LOAD_VALUE", "43"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("FUEL_AIR_COMMAND_RATIO", "44"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("RELATIVE_THROTTLE_POSITION", "45"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("AMBIENT_AIR_TEMPERATURE", "46"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ABSOLUTE_THROTTLE_POSITION_B", "47"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ABSOLUTE_THROTTLE_POSITION_C", "48"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ABSOLUTE_THROTTLE_POSITION_D", "49"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ABSOLUTE_THROTTLE_POSITION_E", "4A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ABSOLUTE_THROTTLE_POSITION_F", "4B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("COMMAND_THROTTLE_ACTUATOR", "4C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("TIME_RUN_WITH_MIL_ON", "4D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("TIME_SINCE_TROUBLE_CODES_CLEARED", "4E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("MAXIMUM_VALUES_FOR_SENSORS", "4F"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("MAXIMUM_VALUE_FOR_AIR_FLOW", "50"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("FUEL_TYPE", "51"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ETHANOL_FUEL_PERCENTAGE", "52"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ABSOLUTE_EVAPORATIVE_SYSTEM_PRESSURE", "53"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("EVAPORATIVE_SYSTEM_PRESSURE_2", "54"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("SHORT_TERM_SECONDARY_OXYGEN_SENSOR_TRIM_1_3", "55"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("LONG_TERM_SECONDARY_OXYGEN_SENSOR_TRIM_1_3", "56"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("SHORT_TERM_SECONDARY_OXYGEN_SENSOR_TRIM_2_4", "57"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("LONG_TERM_SECONDARY_OXYGEN_SENSOR_TRIM_2_4", "58"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("FUEL_RAIL_ABSOLUTE_PRESSURE", "59"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("RELATIVE_ACCELERATOR_PEDAL_POSITION", "5A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("HYBRID_BATTERY_PACK_REMAINING_LIFE", "5B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ENGINE_OIL_TEMPERATURE", "5C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("FUEL_INJECTION_TIMING", "5D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ENGINE_FUEL_RATE", "5E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EMISSION_REQUIREMENTS", "5F"),
    f29404e("SUPPORTED_PIDS_60", "60"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("DRIVERS_DEMAND_ENGINE_TORQUE", "61"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ACTUAL_ENGINE_TORQUE", "62"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ENGINE_REFERENCE_TORQUE", "63"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ENGINE_PERCENT_TORQUE_DATA", "64"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("AUX_INPUT_OUTPUT_SUPPORT", "65"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("MAX_AIRFLOW_SENSOR", "66"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ENGINE_COOLANT_TEMPERATURE", "67"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("INTAKE_AIR_TEMPERATURE_SENSOR", "68"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("COMMANDED_EGR_AND_EGR_ERROR", "69"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("COMMANDED_DIESEL_INTAKE_FLOW_CONTROL_AND_POSITION", "6A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EGR_TEMPERATURE", "6B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("COMMANDED_THROTTLE_CONTROL_AND_RELATIVE_POSITION", "6C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("FUEL_PRESSURE_CONTROL_SYSTEM", "6D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("INJECTION_PRESSURE_CONTROL_SYSTEM", "6E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("TURBO_COMPRESSOR_INLET_PRESSURE", "6F"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("BOOST_PRESSURE_CONTROL", "70"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("VGT_CONTROL", "71"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("WATEGATE_CONTROL", "72"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EXHAUST_PRESSURE", "73"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("TURBO_RPM", "74"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("TURBO_TEMP", "75"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("TURBO_TEMP_2", "76"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("CHARGER_COOLER_TEMP", "77"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("EXHAUST_GAS_TEMP_BANK_1", "78"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EXHAUST_GAS_TEMP_BANK_2", "79"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("DPF", "7A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("DPF_2", "7B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("DPF_TEMP", "7C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("NOS_NTE_STATUS", "7D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("PM_NTE_STATUS", "7E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ENGINE_RUN_TIME", "7F"),
    f29405f("SUPPORTED_PIDS_80", "80"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ENGINE_RUN_TIME_FOR_AECD", "81"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ENGINE_RUN_TIME_FOR_AECD_2", "82"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("NOX_SENSOR", "83"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("MANIFOLD_SURFACE_TEMP", "84"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("NOX_REAGENT_SYSTEM", "85"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("PM_SENSOR", "86"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("INTAKE_MANIFOLD_ABSOLUTE_PRESSURE", "87"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("SCR_INDUCE_SYSTEM", "88"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("RUN_TIME_FOR_AECD_11_15", "89"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("RUN_TIME_FOR_AECD_16_20", "8A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("DIESEL_AFTERTREATMENT", "8B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("O2_SENSOR", "8C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("THROTTLE_POSITION_G", "8D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ENGINE_FRICTION_PERCENT_TORQUE", "8E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("PM_SENSOR_BANK_1_AND_2", "8F"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("WWH_OBD_INFO", "90"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("WWH_OBD_INFO_2", "91"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("FUEL_SYSTEM_CONTROL", "92"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("WWH_OBD_COUNTER_SUPPORT", "93"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NOX_WARNING_AND_INDUCEMENT_SYSTEM", "94"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("EXHAUST_GAS_TEMP_SENSOR", "98"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("EXHAUST_GAS_TEMP_SENSOR_2", "99"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("HYBRID_EV_INFO", "9A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("DIESEL_EXHAUST_FLUID_SENSOR_DATA", "9B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("O2_SENSOR_DATA", "9C"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ENGINE_FUEL_RATE_2", "9D"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ENGINE_EXHAUST_FLOW_RATE", "9E"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("FUEL_SYSTEM_PERCENTAGE_USE", "9F"),
    f29406g("SUPPORTED_PIDS_100", "A0"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NOX_SENSOR_CORRECTED_DATA", "A1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("CYLINDER_FUEL_RATE", "A2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("EVAP_SYSTEM_VAPOR_PRESSURE", "A3"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("TRANSMISSION_ACTUAL_GEAR", "A4"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("DIESEL_EXHAUST_FLUID_DOSING", "A5"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("ODOMETER", "A6"),
    f29407h("SUPPORTED_PIDS_120", "C0"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2635("MISC", "C3"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2649("ENGINE_IDLE_AND_STOP_REQUEST", "C4"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2665("UNKNOWN", "");

    private final int description;
    private final String hex;

    OBDIIService01(String str, String str2) {
        this.hex = str2;
        this.description = i;
    }

    public static ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        for (OBDIIService01 oBDIIService01 : values()) {
            if (list.contains(oBDIIService01.hex)) {
                arrayList.add(oBDIIService01);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p109i8.j
    public final ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() < 2) {
            return new ArrayList();
        }
        int length = str.length() / 2;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            iArr[i10] = Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        switch (Integer.parseInt(this.hex, 16)) {
            case 1:
                int i12 = iArr[0];
                int i13 = i12 & 127;
                boolean z10 = ((i12 >> 7) & 1) == 1;
                int i14 = iArr[1];
                boolean z11 = ((i14 >> 3) & 1) == 1;
                boolean z12 = (i14 & 1) == 1;
                boolean z13 = ((i14 >> 4) & 1) == 1;
                boolean z14 = ((i14 >> 1) & 1) == 1;
                boolean z15 = ((i14 >> 5) & 1) == 1;
                boolean z16 = ((i14 >> 2) & 1) == 1;
                boolean z17 = ((i14 >> 6) & 1) == 1;
                int i15 = iArr[2];
                boolean z18 = (i15 & 1) == 1;
                int i16 = iArr[3];
                boolean z19 = (i16 & 1) == 1;
                boolean z20 = ((i15 >> 1) & 1) == 1;
                boolean z21 = ((i16 >> 1) & 1) == 1;
                boolean z22 = ((i15 >> 2) & 1) == 1;
                boolean z23 = ((i16 >> 2) & 1) == 1;
                boolean z24 = ((i15 >> 3) & 1) == 1;
                boolean z25 = ((i16 >> 3) & 1) == 1;
                boolean z26 = ((i15 >> 5) & 1) == 1;
                boolean z27 = ((i16 >> 5) & 1) == 1;
                boolean z28 = ((i15 >> 6) & 1) == 1;
                boolean z29 = ((i16 >> 6) & 1) == 1;
                boolean z30 = ((i15 >> 7) & 1) == 1;
                boolean z31 = ((i16 >> 7) & 1) == 1;
                String strC = Texttabe.c("MAS00063");
                if (strC == null || strC.isEmpty()) {
                    strC = "Off";
                }
                String strC2 = Texttabe.c("MAS00062");
                if (strC2 == null || strC2.isEmpty()) {
                    strC2 = "On";
                }
                String strC3 = Texttabe.c("MAS00319");
                if (strC3 == null || strC3.isEmpty()) {
                    strC3 = "Not activated";
                }
                String strC4 = Texttabe.c("MAS00504");
                if (strC4 == null || strC4.isEmpty()) {
                    strC4 = "not completed successfully";
                }
                String strC5 = Texttabe.c("MAS00505");
                if (strC5 == null || strC5.isEmpty()) {
                    strC5 = "completed successfully";
                }
                String strC6 = Texttabe.c("MAS00503");
                if (strC6 == null || strC6.isEmpty()) {
                    strC6 = "Number of emission-relevant DTC memory entries";
                }
                String str2 = strC;
                String str3 = strC6;
                String str4 = strC2;
                arrayList.add(new T1(str3, Integer.toString(i13), ""));
                String strC7 = Texttabe.c("MAS00317");
                if (strC7 == null || strC7.isEmpty()) {
                    strC7 = "Malfunction indicator lamp";
                }
                arrayList.add(new T1(strC7, z10 ? str4 : str2, ""));
                String strC8 = Texttabe.c("MAS00328");
                if (strC8 == null || strC8.isEmpty()) {
                    strC8 = "Monitoring of ignition misfires";
                }
                arrayList.add(new T1(strC8, z12 ? z13 ? strC4 : strC5 : strC3, ""));
                String strC9 = Texttabe.c("MAS00329");
                if (strC9 == null || strC9.isEmpty()) {
                    strC9 = "Monitoring of fuel system";
                }
                arrayList.add(new T1(strC9, z14 ? z15 ? strC4 : strC5 : strC3, ""));
                String strC10 = Texttabe.c("MAS00330");
                if (strC10 == null || strC10.isEmpty()) {
                    strC10 = "Monitoring of entire system";
                }
                arrayList.add(new T1(strC10, z16 ? z17 ? strC4 : strC5 : strC3, ""));
                String str5 = "Monitoring of EGR and camshaft adjustment";
                String str6 = "Monitoring of oxygen sensor";
                if (z11) {
                    String strC11 = Texttabe.c("MAS04099");
                    if (strC11 == null || strC11.isEmpty()) {
                        strC11 = "Monitoring of oxidation catalytic converter";
                    }
                    arrayList.add(new T1(strC11, z18 ? z19 ? strC4 : strC5 : strC3, ""));
                    String strC12 = Texttabe.c("MAS04100");
                    if (strC12 == null || strC12.isEmpty()) {
                        strC12 = "Monitoring of NOx catalytic converter";
                    }
                    arrayList.add(new T1(strC12, z20 ? z21 ? strC4 : strC5 : strC3, ""));
                    String strC13 = Texttabe.c("MAS04101");
                    if (strC13 == null || strC13.isEmpty()) {
                        strC13 = "Monitoring of charge pressure control";
                    }
                    arrayList.add(new T1(strC13, z24 ? z25 ? strC4 : strC5 : strC3, ""));
                    String strC14 = Texttabe.c("MAS00339");
                    if (strC14 != null && !strC14.isEmpty()) {
                        str6 = strC14;
                    }
                    arrayList.add(new T1(str6, z26 ? z27 ? strC4 : strC5 : strC3, ""));
                    String strC15 = Texttabe.c("MAS04103");
                    if (strC15 == null || strC15.isEmpty()) {
                        strC15 = "Monitoring of particle filter";
                    }
                    arrayList.add(new T1(strC15, z28 ? z29 ? strC4 : strC5 : strC3, ""));
                    String strC16 = Texttabe.c("MAS04104");
                    if (strC16 != null && !strC16.isEmpty()) {
                        str5 = strC16;
                    }
                    arrayList.add(new T1(str5, z30 ? z31 ? strC4 : strC5 : strC3, ""));
                } else {
                    String strC17 = Texttabe.c("MAS00334");
                    if (strC17 == null || strC17.isEmpty()) {
                        strC17 = "Catalytic converter monitoring";
                    }
                    arrayList.add(new T1(strC17, z18 ? z19 ? strC4 : strC5 : strC3, ""));
                    String strC18 = Texttabe.c("MAS00335");
                    if (strC18 == null || strC18.isEmpty()) {
                        strC18 = "Monitoring of catalytic converter at operating temperature";
                    }
                    arrayList.add(new T1(strC18, z20 ? z21 ? strC4 : strC5 : strC3, ""));
                    String strC19 = Texttabe.c("MAS00336");
                    if (strC19 == null || strC19.isEmpty()) {
                        strC19 = "Monitoring of tank ventilation system";
                    }
                    arrayList.add(new T1(strC19, z22 ? z23 ? strC4 : strC5 : strC3, ""));
                    String strC20 = Texttabe.c("MAS00337");
                    if (strC20 == null || strC20.isEmpty()) {
                        strC20 = "Monitoring of Secondary Air Injection (AIR) system";
                    }
                    arrayList.add(new T1(strC20, z24 ? z25 ? strC4 : strC5 : strC3, ""));
                    String strC21 = Texttabe.c("MAS00339");
                    if (strC21 != null && !strC21.isEmpty()) {
                        str6 = strC21;
                    }
                    arrayList.add(new T1(str6, z26 ? z27 ? strC4 : strC5 : strC3, ""));
                    String strC22 = Texttabe.c("MAS00340");
                    if (strC22 == null || strC22.isEmpty()) {
                        strC22 = "Monitoring of oxygen sensor heater";
                    }
                    arrayList.add(new T1(strC22, z28 ? z29 ? strC4 : strC5 : strC3, ""));
                    String strC23 = Texttabe.c("MAS04104");
                    if (strC23 != null && !strC23.isEmpty()) {
                        str5 = strC23;
                    }
                    arrayList.add(new T1(str5, z30 ? z31 ? strC4 : strC5 : strC3, ""));
                }
                return arrayList;
            case 2:
            case 3:
            case 18:
            case 19:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            default:
                return arrayList;
            case 4:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case 5:
                arrayList.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                return arrayList;
            case 6:
            case 7:
            case 8:
            case 9:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] - 128) * 100) / 128), "%"));
                return arrayList;
            case 10:
                arrayList.add(new T1(null, Integer.toString(iArr[0] * 3), "kPa"));
                return arrayList;
            case 11:
                arrayList.add(new T1(null, Integer.toString(iArr[0]), "kPa"));
                return arrayList;
            case 12:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / 4), "rpm"));
                return arrayList;
            case 13:
                arrayList.add(new T1(null, Integer.toString(iArr[0]), "km/h"));
                return arrayList;
            case 14:
                arrayList.add(new T1(null, Float.toString((iArr[0] - 128) / 2.0f), "° relative to #1 cylinder"));
                return arrayList;
            case 15:
                arrayList.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                return arrayList;
            case 16:
                arrayList.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) / 100.0f), "g/s"));
                return arrayList;
            case 17:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                arrayList.add(new T1(null, Float.toString(iArr[0] / 200.0f), "V"));
                arrayList.add(new T1(null, Integer.toString(((iArr[1] - 128) * 100) / 128), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                arrayList.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY));
                return arrayList;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                arrayList.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "km"));
                return arrayList;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                arrayList.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) * 0.079f), "kPa"));
                return arrayList;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) * 10), "kPa"));
                return arrayList;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                arrayList.add(new T1(null, o.c((iArr[0] << 8) | iArr[1], 2, 65535), ""));
                arrayList.add(new T1(null, o.c((iArr[2] << 8) | iArr[3], 8, 65535), "V"));
                return arrayList;
            case 44:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] - 128) * 100) / 128), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0]), ""));
                return arrayList;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                arrayList.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "km"));
                return arrayList;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                int i17 = (iArr[0] << 8) | iArr[1];
                if (Integer.highestOneBit(i17) == 32768) {
                    i17 |= (-65536) + i17;
                }
                arrayList.add(new T1(null, Integer.toString(i17 / 4), "Pa"));
                return arrayList;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0]), "kPa"));
                return arrayList;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / 32768), ""));
                arrayList.add(new T1(null, Integer.toString((((iArr[2] << 8) | iArr[3]) / 256) - 128), "mA"));
                return arrayList;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                arrayList.add(new T1(null, Float.toString((((iArr[0] << 8) | iArr[1]) / 10.0f) - 40.0f), "°C"));
                return arrayList;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                arrayList.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) / 1000.0f), "V"));
                return arrayList;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                arrayList.add(new T1(null, o.c((iArr[0] << 8) | iArr[1], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                arrayList.add(new T1(null, Integer.toString((iArr[1] | (iArr[0] << 8)) / 32768), ""));
                return arrayList;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                return arrayList;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                arrayList.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "min"));
                return arrayList;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0]), ""));
                arrayList.add(new T1(null, Integer.toString(iArr[1]), "V"));
                arrayList.add(new T1(null, Integer.toString(iArr[2]), "mA"));
                arrayList.add(new T1(null, Integer.toString(iArr[3] * 10), "kPa"));
                return arrayList;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0] * 10), "g/s"));
                return arrayList;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0]), ""));
                return arrayList;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) / t.d.DEFAULT_DRAG_ANIMATION_DURATION), "kPa"));
                return arrayList;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) - 32767), "Pa"));
                return arrayList;
            case 85:
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] - 128) * 100) / 128), "%"));
                if (length > 1) {
                    arrayList.add(new T1(null, Integer.toString(((iArr[1] - 128) * 100) / 128), "%"));
                }
                return arrayList;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                arrayList.add(new T1(null, Integer.toString(((iArr[0] << 8) | iArr[1]) * 10), "kPa"));
                return arrayList;
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                arrayList.add(new T1(null, o.c(iArr[0], 100, 255), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0] - 40), "°C"));
                return arrayList;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                arrayList.add(new T1(null, Float.toString((((iArr[0] << 8) | iArr[1]) - 26880.0f) / 128.0f), "°"));
                return arrayList;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                arrayList.add(new T1(null, Float.toString(((iArr[0] << 8) | iArr[1]) * 0.05f), "l/h"));
                return arrayList;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                arrayList.add(new T1(null, Integer.toString(iArr[0] - 125), "%"));
                return arrayList;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                arrayList.add(new T1(null, Integer.toString((iArr[0] << 8) | iArr[1]), "Nm"));
                return arrayList;
            case 100:
                arrayList.add(new T1(null, Integer.toString(iArr[0] - 125), "%"));
                arrayList.add(new T1(null, Integer.toString(iArr[1] - 125), "%"));
                arrayList.add(new T1(null, Integer.toString(iArr[2] - 125), "%"));
                arrayList.add(new T1(null, Integer.toString(iArr[3] - 125), "%"));
                arrayList.add(new T1(null, Integer.toString(iArr[4] - 125), "%"));
                return arrayList;
        }
    }

    @Override // p109i8.j
    public final String b() {
        return this.hex;
    }

    @Override // p109i8.j
    public final String c(String str) {
        return null;
    }

    @Override // p109i8.j
    public final int getDescription() {
        return this.description;
    }
}
