package p181o8;

import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.ENDOFPDUFIELD;
import com.obdeleven.service.odx.model.SNREF;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p134k8.T1;

/* JADX INFO: compiled from: UDSFreezeFrame.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f45237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Param f45238c = c();

    public c(e eVar, String str) throws OdxFactory$Exception {
        this.f45236a = str;
        this.f45237b = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p181o8.a
    public final List<T1> a() {
        int i10;
        int i11 = 1;
        ArrayList<Param> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Param param = this.f45238c;
        if (param == null || param.c(false).isEmpty()) {
            try {
                this.f45238c = c();
            } catch (OdxFactory$Exception e10) {
                O.e.m(e10);
            }
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (Param param2 : this.f45238c.c(false)) {
            String str = param2.f29457e;
            str.getClass();
            int i19 = -1;
            switch (str.hashCode()) {
                case -1990159820:
                    if (str.equals("Minute")) {
                        i19 = 0;
                    }
                    break;
                case -660217249:
                    if (str.equals("Seconds")) {
                        i19 = i11;
                    }
                    break;
                case 68476:
                    if (str.equals("Day")) {
                        i19 = 2;
                    }
                    break;
                case 2255364:
                    if (str.equals("Hour")) {
                        i19 = 3;
                    }
                    break;
                case 2751581:
                    if (str.equals("Year")) {
                        i19 = 4;
                    }
                    break;
                case 74527328:
                    if (str.equals("Month")) {
                        i19 = 5;
                    }
                    break;
                case 553150271:
                    if (str.equals("km-Mileage")) {
                        i19 = 6;
                    }
                    break;
            }
            switch (i19) {
                case 0:
                    i10 = i11;
                    i16 = Integer.parseInt(param2.f29459g);
                    continue;
                    i11 = i10;
                    break;
                case 1:
                    i10 = i11;
                    i17 = Integer.parseInt(param2.f29459g);
                    continue;
                    i11 = i10;
                    break;
                case 2:
                    i10 = i11;
                    i14 = Integer.parseInt(param2.f29459g);
                    continue;
                    i11 = i10;
                    break;
                case 3:
                    i10 = i11;
                    i15 = Integer.parseInt(param2.f29459g);
                    continue;
                    i11 = i10;
                    break;
                case 4:
                    i10 = i11;
                    i13 = Integer.parseInt(param2.f29459g);
                    continue;
                    i11 = i10;
                    break;
                case 5:
                    try {
                        i12 = Integer.parseInt(param2.f29459g);
                        i10 = i11;
                    } catch (NumberFormatException e11) {
                        String[] months = new DateFormatSymbols().getMonths();
                        int length = months.length;
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            if (i20 < length) {
                                i21++;
                                if (months[i20].toLowerCase().equals(param2.f29459g.toLowerCase())) {
                                    i12 = i21;
                                    i10 = 1;
                                } else {
                                    i20++;
                                    i11 = 1;
                                }
                            } else {
                                i10 = i11;
                                O.e.m(e11);
                                i12 = i10;
                            }
                            i11 = i10;
                        }
                    }
                    if (i12 < i10) {
                        i12 = i10;
                        continue;
                    } else if (i12 > 12) {
                        i12 = 12;
                    }
                    i11 = i10;
                    break;
                case 6:
                    i18 = Integer.parseInt(param2.f29459g);
                    break;
                default:
                    arrayList.add(param2);
                    break;
            }
            i10 = i11;
            i11 = i10;
        }
        if (i13 > 2000 && i13 < 2127 && i12 > 0 && i12 < 13 && i14 > 0 && i15 < 24 && i16 < 60 && i17 < 60) {
            arrayList2.add(new T1("Date", String.format(Locale.US, "%d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)), null));
        }
        if (i18 > 0 && i18 < 1000000) {
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i18);
            arrayList2.add(new T1("Mileage", sb2.toString(), "km"));
        }
        for (Param param3 : arrayList) {
            arrayList2.add(new T1(param3.d(), param3.f(), param3.e()));
        }
        return arrayList2;
    }

    @Override // p181o8.a
    public final String b() {
        return this.f45236a;
    }

    public final Param c() throws OdxFactory$Exception {
        String str = this.f45236a;
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i11, i11 + 2), 16);
        }
        SNREF snref = new SNREF();
        snref.setSHORTNAME("EOPDUF_DTCExtenDataRecor");
        e eVar = this.f45237b;
        e.c cVarM = eVar.m(snref);
        return eVar.c(cVarM.f29500b, (ENDOFPDUFIELD) cVarM.f29499a, bArr);
    }
}
