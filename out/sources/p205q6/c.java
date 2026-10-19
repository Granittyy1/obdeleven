package p205q6;

import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Iterator;
import p131k5.P;
import p131k5.Y;
import p192p6.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f46134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a.b f46135b;

    @Override // p205q6.a
    public final void a(HashSet hashSet) {
        HashSet hashSet2 = this.f46134a;
        hashSet2.clear();
        HashSet hashSet3 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet3.size() >= 50) {
                break;
            }
            ImmutableSet<String> immutableSet = d.f46136a;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (Character.isLetter(iCodePointAt) || iCodePointAt == 95) {
                    int length = str.length();
                    int iCharCount = Character.charCount(iCodePointAt);
                    while (true) {
                        if (iCharCount >= length) {
                            if (str.length() != 0) {
                                int iCodePointAt2 = str.codePointAt(0);
                                if (!Character.isLetter(iCodePointAt2)) {
                                    break;
                                }
                                int length2 = str.length();
                                int iCharCount2 = Character.charCount(iCodePointAt2);
                                while (true) {
                                    if (iCharCount2 < length2) {
                                        int iCodePointAt3 = str.codePointAt(iCharCount2);
                                        if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                            break;
                                        } else {
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                        }
                                    } else {
                                        String strB = Y.b(str, P.f41945e, P.f41947g);
                                        if (strB != null) {
                                            str = strB;
                                        }
                                        hashSet3.add(str);
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        } else {
                            int iCodePointAt4 = str.codePointAt(iCharCount);
                            if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt4);
                            }
                        }
                    }
                }
            }
        }
        hashSet2.addAll(hashSet3);
    }
}
