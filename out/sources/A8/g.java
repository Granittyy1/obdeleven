package A8;

import G8.B;
import G8.C0703e;
import G8.C0704f;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.protocol.Kwp2000Protocol;
import com.obdeleven.service.protocol.Protocol;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.domain.models.CodingType;
import com.voltasit.obdeleven.domain.models.ControlUnitStatus;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p255u9.C2801d;

/* JADX INFO: compiled from: ControlUnitLegacyToControlUnitMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f980a;

    public g(e eVar, u uVar) {
        this.f980a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[PHI: r5
      0x007d: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v31 java.lang.String) binds: [B:26:0x0088, B:21:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    public final C0703e a(ControlUnit input) {
        B b10;
        String str;
        String str2;
        boolean z10;
        CodingType codingType;
        ControlUnitStatus controlUnitStatus;
        ProtocolType protocolType;
        String string;
        String string2;
        String string3;
        String string4;
        kotlin.jvm.internal.i.e(input, "input");
        C2801d controlUnitBase = input.f29320b.getControlUnitBase();
        p255u9.v vVar = (p255u9.v) controlUnitBase.getParseObject("texttable");
        if (vVar == null) {
            b10 = new B("", kotlin.collections.y.p());
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (DatabaseLanguage databaseLanguage : DatabaseLanguage.values()) {
                String string5 = vVar.getString(databaseLanguage.b());
                if (string5 != null) {
                    f.f(databaseLanguage, "getCode(...)", linkedHashMap, string5);
                }
            }
            String objectId = vVar.getObjectId();
            kotlin.jvm.internal.i.b(objectId);
            b10 = new B(objectId, linkedHashMap);
        }
        com.voltasit.parse.model.CodingType codingType2 = input.f29320b.getCodingType();
        if (codingType2 == null) {
            codingType2 = com.voltasit.parse.model.CodingType.f34402b;
        }
        int iOrdinal = codingType2.ordinal();
        if (iOrdinal == 3) {
            str = (String) input.Q().f10040b;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            z10 = true;
        } else if (iOrdinal != 4) {
            str2 = "";
            z10 = false;
        } else {
            str = input.W().f42831c;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            z10 = true;
        }
        CodingType.a aVar = CodingType.f30447b;
        String strC = codingType2.c();
        aVar.getClass();
        CodingType[] codingTypeArr = CodingType.f30448c;
        int length = codingTypeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                codingType = null;
                break;
            }
            codingType = codingTypeArr[i10];
            if (kotlin.jvm.internal.i.a(codingType.a(), strC)) {
                break;
            }
            i10++;
        }
        CodingType codingType3 = codingType == null ? CodingType.UNKNOWN : codingType;
        String objectId2 = input.f29320b.getVehicle().getObjectId();
        kotlin.jvm.internal.i.d(objectId2, "getObjectId(...)");
        String objectId3 = input.f29320b.getObjectId();
        String str3 = objectId3 == null ? "" : objectId3;
        String objectId4 = controlUnitBase.getObjectId();
        kotlin.jvm.internal.i.d(objectId4, "getObjectId(...)");
        String url = controlUnitBase.getParseFile("picture") == null ? "" : controlUnitBase.getParseFile("picture").getUrl();
        kotlin.jvm.internal.i.b(url);
        short sShortValue = controlUnitBase.a().shortValue();
        String string6 = controlUnitBase.getString("canKWP2000Id");
        String str4 = string6 == null ? "" : string6;
        String string7 = controlUnitBase.getString("klineKWP2000Id");
        String str5 = string7 == null ? "" : string7;
        String string8 = controlUnitBase.getString("udsContiId");
        String str6 = string8 == null ? "" : string8;
        String string9 = controlUnitBase.getString("udsExtRespId");
        String str7 = string9 == null ? "" : string9;
        String string10 = controlUnitBase.getString("udsExtReqId");
        String str8 = string10 == null ? "" : string10;
        String string11 = controlUnitBase.getString("udsRespId");
        String str9 = string11 == null ? "" : string11;
        String string12 = controlUnitBase.getString("udsReqId");
        String str10 = string12 == null ? "" : string12;
        String string13 = controlUnitBase.getString("name");
        kotlin.jvm.internal.i.d(string13, "getName(...)");
        C0704f c0704f = new C0704f(objectId4, url, sShortValue, str4, str5, str6, str7, str8, str9, str10, string13, b10);
        ControlUnitDB parent = input.f29320b.getParent();
        C0703e c0703eA = parent != null ? this.f980a.a(parent) : null;
        if (!input.b()) {
            controlUnitStatus = ControlUnitStatus.f30456d;
        } else if (input.j0()) {
            controlUnitStatus = input.f29337t ? ControlUnitStatus.f30454b : ControlUnitStatus.f30458f;
        } else {
            controlUnitStatus = ControlUnitStatus.f30455c;
        }
        ControlUnitStatus controlUnitStatus2 = controlUnitStatus;
        Object obj = input.f29320b.get("adaptations");
        String str11 = (obj == null || (string4 = obj.toString()) == null) ? "" : string4;
        JSONObject udsData = input.f29320b.getUdsData();
        String str12 = (udsData == null || (string3 = udsData.toString()) == null) ? "" : string3;
        JSONObject kWP2000Data = input.f29320b.getKWP2000Data();
        String str13 = (kWP2000Data == null || (string2 = kWP2000Data.toString()) == null) ? "" : string2;
        JSONArray faults = input.f29320b.getFaults();
        kotlin.jvm.internal.i.d(faults, "getFaults(...)");
        ArrayList arrayListV = D9.o.v(faults);
        JSONObject kWP1281Data = input.f29320b.getKWP1281Data();
        String str14 = (kWP1281Data == null || (string = kWP1281Data.toString()) == null) ? "" : string;
        boolean z11 = input.f29320b.getSystemDescription() != null;
        String systemDescription = input.f29320b.getSystemDescription();
        String str15 = systemDescription == null ? "" : systemDescription;
        boolean z12 = input.f29320b.getHWVersion() != null;
        String hWVersion = input.f29320b.getHWVersion();
        String str16 = hWVersion == null ? "" : hWVersion;
        boolean z13 = input.f29320b.getHWNumber() != null;
        String hWNumber = input.f29320b.getHWNumber();
        String str17 = hWNumber == null ? "" : hWNumber;
        boolean z14 = input.f29320b.getSWVersion() != null;
        String sWVersion = input.f29320b.getSWVersion();
        String str18 = sWVersion == null ? "" : sWVersion;
        boolean z15 = input.f29320b.getSWNumber() != null;
        String sWNumber = input.f29320b.getSWNumber();
        String str19 = sWNumber == null ? "" : sWNumber;
        boolean z16 = input.f29320b.getODXName() != null;
        String oDXName = input.f29320b.getODXName();
        String str20 = oDXName == null ? "" : oDXName;
        boolean z17 = input.f29320b.getODXVersion() != null;
        String oDXVersion = input.f29320b.getODXVersion();
        String str21 = oDXVersion == null ? "" : oDXVersion;
        boolean z18 = input.f29320b.getSystemIdentifier() != null;
        String systemIdentifier = input.f29320b.getSystemIdentifier();
        String str22 = systemIdentifier == null ? "" : systemIdentifier;
        Protocol protocol = input.f29324f;
        if (protocol instanceof com.obdeleven.service.protocol.f) {
            protocolType = ProtocolType.CAN_UDS;
        } else if (protocol instanceof com.obdeleven.service.protocol.b) {
            protocolType = ProtocolType.KLINE_KWP1281;
        } else if (protocol instanceof Kwp2000Protocol) {
            protocolType = ProtocolType.KLINE_KWP2000_FUNCTIONAL;
        } else if (protocol instanceof com.obdeleven.service.protocol.c) {
            protocolType = ProtocolType.TP20_KWP2002;
        } else if (protocol instanceof com.obdeleven.service.protocol.d) {
            protocolType = ProtocolType.KLINE_OBDII_MULTI_MESSAGE;
        } else if (protocol instanceof com.obdeleven.service.protocol.e) {
            protocolType = ProtocolType.KLINE_OBDII;
        } else {
            protocolType = protocol instanceof com.obdeleven.service.protocol.a ? ProtocolType.CAN_OBDII : ProtocolType.UNKNOWN;
        }
        ProtocolType protocolType2 = protocolType;
        int i11 = input.f29320b.getInt("scannedLogins");
        boolean z19 = input.f29320b.getSerialNumber() != null;
        String serialNumber = input.f29320b.getSerialNumber();
        return new C0703e(objectId2, str3, c0704f, c0703eA, controlUnitStatus2, str11, z10, str2, str12, str13, arrayListV, str14, z11, str15, z12, str16, z13, str17, z14, str18, z15, str19, z16, str20, z17, str21, z18, str22, protocolType2, i11, z19, serialNumber == null ? "" : serialNumber, input.f29320b.hasSubsystems(), codingType3, 0, 4);
    }
}
