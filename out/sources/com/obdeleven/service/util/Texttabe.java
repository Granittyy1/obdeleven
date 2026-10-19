package com.obdeleven.service.util;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class Texttabe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, String> f29550a;

    public enum NRC {
        /* JADX INFO: Fake field, exist only in values array */
        EF0("NRC_10", "MAS01011"),
        f29551b("NRC_11", "MAS01012"),
        /* JADX INFO: Fake field, exist only in values array */
        EF33("NRC_12", "MAS01012"),
        /* JADX INFO: Fake field, exist only in values array */
        EF45("NRC_13", "MAS01013"),
        /* JADX INFO: Fake field, exist only in values array */
        EF57("NRC_21", "MAS01014"),
        /* JADX INFO: Fake field, exist only in values array */
        EF69("NRC_22", "MAS01015"),
        /* JADX INFO: Fake field, exist only in values array */
        EF81("NRC_24", "MAS01016"),
        /* JADX INFO: Fake field, exist only in values array */
        EF93("NRC_25", "MAS01017"),
        /* JADX INFO: Fake field, exist only in values array */
        EF106("NRC_26", "MAS01018"),
        /* JADX INFO: Fake field, exist only in values array */
        EF117("NRC_31", "MAS01012"),
        /* JADX INFO: Fake field, exist only in values array */
        EF130("NRC_33", "MAS01027"),
        /* JADX INFO: Fake field, exist only in values array */
        EF143("NRC_35", "MAS01028"),
        /* JADX INFO: Fake field, exist only in values array */
        EF158("NRC_36", "MAS01029"),
        /* JADX INFO: Fake field, exist only in values array */
        EF173("NRC_37", "MAS01030"),
        /* JADX INFO: Fake field, exist only in values array */
        EF188("NRC_70", "MAS02023"),
        /* JADX INFO: Fake field, exist only in values array */
        EF203("NRC_71", "MAS02024"),
        /* JADX INFO: Fake field, exist only in values array */
        EF218("NRC_72", "MAS02025"),
        /* JADX INFO: Fake field, exist only in values array */
        EF233("NRC_73", "MAS02026"),
        /* JADX INFO: Fake field, exist only in values array */
        EF248("NRC_78", "MAS02027"),
        /* JADX INFO: Fake field, exist only in values array */
        EF263("NRC_7E", "MAS01031"),
        /* JADX INFO: Fake field, exist only in values array */
        EF276("NRC_7F", "MAS01031"),
        /* JADX INFO: Fake field, exist only in values array */
        EF291("NRC_81", "MAS01032"),
        /* JADX INFO: Fake field, exist only in values array */
        EF306("NRC_82", "MAS01033"),
        /* JADX INFO: Fake field, exist only in values array */
        EF321("NRC_83", "MAS01034"),
        /* JADX INFO: Fake field, exist only in values array */
        EF336("NRC_84", "MAS01035"),
        /* JADX INFO: Fake field, exist only in values array */
        EF351("NRC_85", "MAS01036"),
        /* JADX INFO: Fake field, exist only in values array */
        EF366("NRC_86", "MAS01037"),
        /* JADX INFO: Fake field, exist only in values array */
        EF381("NRC_87", "MAS01038"),
        /* JADX INFO: Fake field, exist only in values array */
        EF396("NRC_88", "MAS01039"),
        /* JADX INFO: Fake field, exist only in values array */
        EF411("NRC_89", "MAS01040"),
        /* JADX INFO: Fake field, exist only in values array */
        EF426("NRC_8A", "MAS01041"),
        /* JADX INFO: Fake field, exist only in values array */
        EF441("NRC_8B", "MAS01042"),
        /* JADX INFO: Fake field, exist only in values array */
        EF456("NRC_8C", "MAS01043"),
        /* JADX INFO: Fake field, exist only in values array */
        EF471("NRC_8D", "MAS01044"),
        /* JADX INFO: Fake field, exist only in values array */
        EF486("NRC_8F", "MAS01045"),
        /* JADX INFO: Fake field, exist only in values array */
        EF501("NRC_90", "MAS01046"),
        /* JADX INFO: Fake field, exist only in values array */
        EF516("NRC_91", "MAS01047"),
        /* JADX INFO: Fake field, exist only in values array */
        EF531("NRC_92", "MAS01048"),
        /* JADX INFO: Fake field, exist only in values array */
        EF546("NRC_93", "MAS01049");

        public final int nrc;
        public final String ti;

        NRC(String str, String str2) {
            this.nrc = i;
            this.ti = str2;
        }
    }

    public class a extends L7.a<HashMap<String, String>> {
    }

    public static String a(int i10) {
        return c(b(i10));
    }

    public static String b(int i10) {
        NRC nrc = NRC.f29551b;
        for (NRC nrc2 : NRC.values()) {
            if (nrc2.nrc == i10) {
                nrc = nrc2;
            }
        }
        return nrc.ti;
    }

    public static String c(String str) {
        HashMap<String, String> map = f29550a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public static void d(Context context, String str) {
        p267v9.a.f47671a = str;
        try {
            AssetManager assets = context.getAssets();
            Locale locale = Locale.US;
            M7.a aVar = new M7.a(new InputStreamReader(assets.open("lang/" + str + ".json"), StandardCharsets.UTF_8));
            try {
                f29550a = (HashMap) new Gson().b(aVar, L7.a.get(new a().getType()));
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
