package p165n4;

import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.collections.y;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44880d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f44881e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f44883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f44884c;

    /* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
    public static final class a {
        public static f b() {
            return new f(null, y.r(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), y.r(new Pair(Integer.valueOf(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu), null), new Pair(190, null), new Pair(412, null)), null, null, null);
        }

        public static HashMap c(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = jSONArrayOptJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                                    if (iOptInt2 != 0) {
                                        hashSet.add(Integer.valueOf(iOptInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        map.put(Integer.valueOf(iOptInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return map;
        }

        public final synchronized f a() {
            f fVar;
            try {
                if (f.f44881e == null) {
                    f.f44881e = b();
                }
                fVar = f.f44881e;
                if (fVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th) {
                throw th;
            }
            return fVar;
        }
    }

    /* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44885a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            f44885a = iArr;
        }
    }

    public f(HashMap map, HashMap map2, HashMap map3, String str, String str2, String str3) {
        this.f44882a = map;
        this.f44883b = map2;
        this.f44884c = map3;
    }
}
