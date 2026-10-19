package p141l2;

import A8.A;
import android.net.Uri;
import android.os.Bundle;
import com.braze.models.FeatureFlag;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2738h extends L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2738h(int i10, boolean z10) {
        super(z10);
        this.f44285a = i10;
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        switch (this.f44285a) {
            case 0:
                i.e(bundle, "bundle");
                i.e(key, "key");
                float f10 = bundle.getFloat(key, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
                    return Float.valueOf(f10);
                }
                A.g(key);
                throw null;
            default:
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (!bundle.containsKey(key) || b.c(bundle, key)) {
                    return null;
                }
                String string = bundle.getString(key);
                if (string != null) {
                    return string;
                }
                A.g(key);
                throw null;
        }
    }

    @Override // p141l2.L
    public final String getName() {
        switch (this.f44285a) {
            case 0:
                return AttributeType.FLOAT;
            default:
                return FeatureFlag.PROPERTIES_TYPE_STRING;
        }
    }

    @Override // p141l2.L
    public final Object parseValue(String value) {
        switch (this.f44285a) {
            case 0:
                i.e(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            default:
                i.e(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        switch (this.f44285a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                i.e(bundle, "bundle");
                i.e(key, "key");
                bundle.putFloat(key, fFloatValue);
                break;
            default:
                String str = (String) obj;
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (str == null) {
                    f.a(bundle, key);
                } else {
                    f.d(bundle, key, str);
                }
                break;
        }
    }

    @Override // p141l2.L
    public String serializeAsValue(Object obj) {
        switch (this.f44285a) {
            case 1:
                String s10 = (String) obj;
                if (s10 == null) {
                    return "null";
                }
                i.e(s10, "s");
                String strEncode = Uri.encode(s10, null);
                i.d(strEncode, "encode(...)");
                return strEncode;
            default:
                return super.serializeAsValue(obj);
        }
    }
}
