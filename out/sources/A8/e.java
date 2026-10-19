package A8;

import G8.B;
import G8.C0703e;
import G8.C0704f;
import com.parse.ControlUnitDB;
import com.parse.ParseFile;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.domain.models.CodingType;
import com.voltasit.obdeleven.domain.models.ControlUnitStatus;
import com.voltasit.obdeleven.domain.models.ProtocolType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import p255u9.C2801d;

/* JADX INFO: compiled from: ControlUnitDbToControlUnitMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final C0703e a(ControlUnitDB input) {
        CodingType codingType;
        G8.y yVar;
        String codingValue;
        ProtocolType protocolType;
        String string;
        String string2;
        String string3;
        String string4;
        kotlin.jvm.internal.i.e(input, "input");
        C2801d controlUnitBase = input.getControlUnitBase();
        p255u9.v vVar = (p255u9.v) controlUnitBase.getParseObject("texttable");
        boolean z10 = input.getCodingType() == com.voltasit.parse.model.CodingType.f34404d;
        CodingType.a aVar = CodingType.f30447b;
        String strC = input.getCodingType().c();
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
            if (kotlin.jvm.internal.i.a(codingType.name(), strC)) {
                break;
            }
            i10++;
        }
        if (codingType == null) {
            codingType = CodingType.UNKNOWN;
        }
        CodingType codingType2 = codingType;
        p255u9.s sgbd = input.getSgbd();
        if (sgbd != null) {
            String objectId = sgbd.getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            String string5 = sgbd.getString("textId");
            String str = string5 == null ? "" : string5;
            String string6 = sgbd.getString("name");
            String str2 = string6 == null ? "" : string6;
            int i11 = sgbd.getInt("adr");
            int i12 = sgbd.getInt("index");
            String string7 = sgbd.getString("series");
            String str3 = string7 == null ? "" : string7;
            String string8 = sgbd.getString("sgbdFileName");
            String str4 = string8 == null ? "" : string8;
            ParseFile parseFile = sgbd.getParseFile("picture");
            String url = parseFile != null ? parseFile.getUrl() : null;
            String str5 = url == null ? "" : url;
            String string9 = sgbd.getString("group");
            yVar = new G8.y(objectId, str, str2, i11, i12, str3, str4, str5, string9 == null ? "" : string9);
        } else {
            yVar = null;
        }
        String objectId2 = input.getVehicle().getObjectId();
        kotlin.jvm.internal.i.d(objectId2, "getObjectId(...)");
        String objectId3 = input.getObjectId();
        kotlin.jvm.internal.i.d(objectId3, "getObjectId(...)");
        String objectId4 = controlUnitBase.getObjectId();
        kotlin.jvm.internal.i.d(objectId4, "getObjectId(...)");
        String url2 = controlUnitBase.getParseFile("picture") == null ? "" : controlUnitBase.getParseFile("picture").getUrl();
        kotlin.jvm.internal.i.b(url2);
        short sShortValue = controlUnitBase.a().shortValue();
        String string10 = controlUnitBase.getString("canKWP2000Id");
        String str6 = string10 == null ? "" : string10;
        String string11 = controlUnitBase.getString("klineKWP2000Id");
        String str7 = string11 == null ? "" : string11;
        String string12 = controlUnitBase.getString("udsContiId");
        String str8 = string12 == null ? "" : string12;
        String string13 = controlUnitBase.getString("udsExtRespId");
        String str9 = string13 == null ? "" : string13;
        String string14 = controlUnitBase.getString("udsExtReqId");
        String str10 = string14 == null ? "" : string14;
        String string15 = controlUnitBase.getString("udsRespId");
        String str11 = string15 == null ? "" : string15;
        String string16 = controlUnitBase.getString("udsReqId");
        String str12 = string16 == null ? "" : string16;
        String string17 = controlUnitBase.getString("name");
        kotlin.jvm.internal.i.d(string17, "getName(...)");
        DatabaseLanguage[] databaseLanguageArrValues = DatabaseLanguage.values();
        int iN = kotlin.collections.x.n(databaseLanguageArrValues.length);
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (DatabaseLanguage databaseLanguage : databaseLanguageArrValues) {
            Pair pair = new Pair(databaseLanguage.b(), vVar.a(databaseLanguage.b()));
            linkedHashMap.put(pair.c(), pair.d());
        }
        C0704f c0704f = new C0704f(objectId4, url2, sShortValue, str6, str7, str8, str9, str10, str11, str12, string17, new B("", linkedHashMap));
        ControlUnitDB parent = input.getParent();
        C0703e c0703eA = parent != null ? a(parent) : null;
        ControlUnitStatus controlUnitStatus = input.getFaults().length() > 0 ? ControlUnitStatus.f30454b : ControlUnitStatus.f30457e;
        Object obj = input.get("adaptations");
        String str13 = (obj == null || (string4 = obj.toString()) == null) ? "" : string4;
        boolean z11 = (z10 || input.getCodingValue() == null) ? false : true;
        String str14 = (z10 || (codingValue = input.getCodingValue()) == null) ? "" : codingValue;
        JSONObject udsData = input.getUdsData();
        String str15 = (udsData == null || (string3 = udsData.toString()) == null) ? "" : string3;
        JSONObject kWP2000Data = input.getKWP2000Data();
        String str16 = (kWP2000Data == null || (string2 = kWP2000Data.toString()) == null) ? "" : string2;
        JSONArray faults = input.getFaults();
        kotlin.jvm.internal.i.d(faults, "getFaults(...)");
        ArrayList arrayListV = D9.o.v(faults);
        JSONObject kWP1281Data = input.getKWP1281Data();
        String str17 = (kWP1281Data == null || (string = kWP1281Data.toString()) == null) ? "" : string;
        boolean z12 = input.getSystemDescription() != null;
        String systemDescription = input.getSystemDescription();
        String str18 = systemDescription == null ? "" : systemDescription;
        boolean z13 = input.getHWVersion() != null;
        String hWVersion = input.getHWVersion();
        if (hWVersion == null) {
            hWVersion = "";
        }
        boolean z14 = input.getHWNumber() != null;
        String hWNumber = input.getHWNumber();
        String str19 = hWNumber == null ? "" : hWNumber;
        boolean z15 = input.getSWVersion() != null;
        String sWVersion = input.getSWVersion();
        String str20 = sWVersion == null ? "" : sWVersion;
        boolean z16 = input.getSWNumber() != null;
        String sWNumber = input.getSWNumber();
        String str21 = sWNumber == null ? "" : sWNumber;
        boolean z17 = input.getODXName() != null;
        String oDXName = input.getODXName();
        String str22 = oDXName == null ? "" : oDXName;
        boolean z18 = input.getODXVersion() != null;
        String oDXVersion = input.getODXVersion();
        String str23 = oDXVersion == null ? "" : oDXVersion;
        boolean z19 = input.getSystemIdentifier() != null;
        String systemIdentifier = input.getSystemIdentifier();
        String str24 = systemIdentifier == null ? "" : systemIdentifier;
        ProtocolType.a aVar2 = ProtocolType.f30505b;
        String protocol = input.getProtocol();
        if (protocol == null) {
            protocol = "";
        }
        aVar2.getClass();
        String strG = kotlin.text.m.G(protocol, " ", "");
        ProtocolType[] protocolTypeArrValues = ProtocolType.values();
        int length2 = protocolTypeArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length2) {
                protocolType = ProtocolType.UNKNOWN;
                break;
            }
            ProtocolType protocolType2 = protocolTypeArrValues[i13];
            if (kotlin.jvm.internal.i.a(protocolType2.a(), strG)) {
                protocolType = protocolType2;
                break;
            }
            i13++;
        }
        int i14 = input.getInt("scannedLogins");
        boolean z20 = input.getSerialNumber() != null;
        String serialNumber = input.getSerialNumber();
        return new C0703e(objectId2, objectId3, c0704f, c0703eA, controlUnitStatus, str13, z11, str14, str15, str16, arrayListV, str17, z12, str18, z13, hWVersion, z14, str19, z15, str20, z16, str21, z17, str22, z18, str23, z19, str24, protocolType, i14, z20, serialNumber == null ? "" : serialNumber, input.hasSubsystems(), codingType2, yVar);
    }
}
