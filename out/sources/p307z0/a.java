package p307z0;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: BidiFormatter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48684e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48685a;

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BidiFormatter.java */
    public static class C0561a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f48686e = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharSequence f48687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public char f48690d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f48686e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0561a(CharSequence charSequence) {
            this.f48687a = charSequence;
            this.f48688b = charSequence.length();
        }

        public final byte a() {
            int i10 = this.f48689c - 1;
            CharSequence charSequence = this.f48687a;
            char cCharAt = charSequence.charAt(i10);
            this.f48690d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f48689c);
                this.f48689c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f48689c--;
            char c10 = this.f48690d;
            return c10 < 1792 ? f48686e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        e.c cVar = e.f48697c;
        f48681b = Character.toString((char) 8206);
        f48682c = Character.toString((char) 8207);
        f48683d = new a(false);
        f48684e = new a(true);
    }

    public a(boolean z10) {
        e.c cVar = e.f48695a;
        this.f48685a = z10;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        C0561a c0561a = new C0561a(charSequence);
        c0561a.f48689c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = c0561a.f48689c;
            if (i13 < c0561a.f48688b && i10 == 0) {
                CharSequence charSequence2 = c0561a.f48687a;
                char cCharAt = charSequence2.charAt(i13);
                c0561a.f48690d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0561a.f48689c);
                    c0561a.f48689c = Character.charCount(iCodePointAt) + c0561a.f48689c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0561a.f48689c++;
                    char c10 = c0561a.f48690d;
                    directionality = c10 < 1792 ? C0561a.f48686e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i11 != 0) {
            return i11;
        }
        while (c0561a.f48689c > 0) {
            switch (c0561a.a()) {
                case 14:
                case 15:
                    if (i10 == i12) {
                        return -1;
                    }
                    i12--;
                    break;
                case 16:
                case 17:
                    if (i10 == i12) {
                        return 1;
                    }
                    i12--;
                    break;
                case 18:
                    i12++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        C0561a c0561a = new C0561a(charSequence);
        c0561a.f48689c = c0561a.f48688b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (c0561a.f48689c > 0) {
                byte bA = c0561a.a();
                if (bA == 0) {
                    if (i10 == 0) {
                        return -1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i10 == 0) {
                        return 1;
                    }
                    if (i11 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i11 == i10) {
                                return -1;
                            }
                            i10--;
                            break;
                        case 16:
                        case 17:
                            if (i11 == i10) {
                                return 1;
                            }
                            i10--;
                            break;
                        case 18:
                            i10++;
                            break;
                        default:
                            if (i11 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static a c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f48684e : f48683d;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        String str;
        e.c cVar = e.f48697c;
        if (charSequence == null) {
            return null;
        }
        boolean zB = cVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zB2 = (zB ? e.f48696b : e.f48695a).b(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f48682c;
        String str4 = f48681b;
        boolean z10 = this.f48685a;
        if (z10 || !(zB2 || a(charSequence) == 1)) {
            str = (!z10 || (zB2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zB != z10) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? e.f48696b : e.f48695a).b(charSequence, charSequence.length());
        if (!z10 && (zB3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!zB3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
