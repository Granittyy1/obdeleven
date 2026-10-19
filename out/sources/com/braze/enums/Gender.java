package com.braze.enums;

import B7.b;
import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public enum Gender implements IPutIntoJson<String> {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    UNKNOWN("u"),
    NOT_APPLICABLE(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID),
    PREFER_NOT_TO_SAY(Constants.BRAZE_PUSH_PRIORITY_KEY);

    public static final Companion Companion = new Companion(null);
    private final String value;

    public static final class Companion {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24058b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f24058b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return b.g(new StringBuilder("No gender with value "), this.f24058b, '.');
            }
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Gender getGender(String str) {
            String lowerCase;
            Gender gender = null;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                lowerCase = null;
            }
            Gender[] genderArrValues = Gender.values();
            int length = genderArrValues.length;
            int i10 = 0;
            Gender gender2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 >= length) {
                    if (!z10) {
                        break;
                    }
                    gender = gender2;
                    break;
                }
                Gender gender3 = genderArrValues[i10];
                if (i.a(gender3.getValue(), lowerCase)) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    gender2 = gender3;
                }
                i10++;
            }
            if (gender == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(str), 2, (Object) null);
            }
            return gender;
        }

        private Companion() {
        }
    }

    Gender(String str) {
        this.value = str;
    }

    public static final Gender getGender(String str) {
        return Companion.getGender(str);
    }

    public final String getValue() {
        return this.value;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.value;
    }
}
