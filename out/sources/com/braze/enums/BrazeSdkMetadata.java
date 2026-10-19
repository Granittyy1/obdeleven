package com.braze.enums;

import com.braze.models.IPutIntoJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public enum BrazeSdkMetadata implements IPutIntoJson<String> {
    ADJUST("adj"),
    AIRBRIDGE("air"),
    APPSFLYER("apf"),
    BLUEDOT("blt"),
    BRANCH("brc"),
    CORDOVA("cdva"),
    EXPO("expo"),
    FACTUAL("fct"),
    FOURSQUARE("fsq"),
    FLUTTER("ft"),
    GRADLE("gd"),
    GOOGLE("gg"),
    GIMBAL("gmb"),
    IONIC("ionc"),
    KOCHAVA("kch"),
    MANUAL("manu"),
    MPARTICLE("mp"),
    NPM("npm"),
    NATIVESCRIPT("ns"),
    NUGET("nugt"),
    PUB("pub"),
    RADAR("rdr"),
    REACTNATIVE("rn"),
    REACTNATIVENEWARCH("rnna"),
    SEGMENT("sg"),
    SINGULAR("sng"),
    SPM("spm"),
    TEALIUM("tl"),
    UNREAL("un"),
    UNITY_PACKAGE_MANAGER("unpm"),
    UNITY("ut"),
    VIZBEE("vzb"),
    WEBCDN("wcd"),
    XAMARIN("xam");

    public static final a Companion = new a(null);
    private final String jsonKey;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final JSONArray a(EnumSet set) {
            i.e(set, "set");
            ArrayList arrayList = new ArrayList(m.y(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                BrazeSdkMetadata it2 = (BrazeSdkMetadata) it.next();
                i.d(it2, "it");
                arrayList.add(it2.jsonKey);
            }
            return new JSONArray((Collection) q.g0(arrayList));
        }

        private a() {
        }
    }

    BrazeSdkMetadata(String str) {
        this.jsonKey = str;
    }

    public static final JSONArray toJsonArray(EnumSet<BrazeSdkMetadata> enumSet) {
        return Companion.a(enumSet);
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.jsonKey;
    }
}
