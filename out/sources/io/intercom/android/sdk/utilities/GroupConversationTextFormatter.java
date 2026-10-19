package io.intercom.android.sdk.utilities;

import C4.b;
import android.content.Context;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: GroupConversationTextFormatter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GroupConversationTextFormatter {
    public static final int $stable = 0;
    public static final GroupConversationTextFormatter INSTANCE = new GroupConversationTextFormatter();

    private GroupConversationTextFormatter() {
    }

    public static final CharSequence groupConversationSubtitle(String firstName, int i10, Context context) {
        i.e(firstName, "firstName");
        i.e(context, "context");
        if (i10 == 1) {
            CharSequence charSequence = Phrase.from(context, R.string.intercom_name_and_1_other).put("name", firstName).format();
            i.b(charSequence);
            return charSequence;
        }
        if (i10 <= 1) {
            return firstName;
        }
        CharSequence charSequence2 = Phrase.from(context, R.string.intercom_name_and_x_others).put("name", firstName).put("count", i10).format();
        i.b(charSequence2);
        return charSequence2;
    }

    public static final CharSequence groupConversationTitle(String firstName, int i10, Context context) {
        i.e(firstName, "firstName");
        i.e(context, "context");
        if (i10 == 1) {
            StringBuilder sbE = b.e(firstName);
            sbE.append(context.getString(R.string.intercom_group_conversation_1_other_participant_count_short));
            return sbE.toString();
        }
        if (i10 <= 1) {
            return firstName;
        }
        StringBuilder sbE2 = b.e(firstName);
        sbE2.append((Object) Phrase.from(context, R.string.intercom_group_conversation_multiple_other_participant_count_short).put("other_participant_count", i10).format());
        return sbE2.toString();
    }
}
