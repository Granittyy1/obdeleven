package io.intercom.android.sdk.m5.home.reducers;

import Q3.d;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HeaderBackdropType;
import io.intercom.android.sdk.models.HeaderBackgroundModel;
import io.intercom.android.sdk.models.HeaderConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: HomeHeaderStateReducer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeHeaderStateReducerKt {

    /* JADX INFO: compiled from: HomeHeaderStateReducer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderBackdropType.values().length];
            try {
                iArr[HeaderBackdropType.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderBackdropType.COLORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HeaderBackdropType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:36:0x0462 A[LOOP:0: B:34:0x045c->B:36:0x0462, LOOP_END] */
    public static final HomeUiState.Content.ContentHeader computeContentHeader(ConfigModules configModules, TeamPresence teamPresence, boolean z10) {
        Pair pair;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor2;
        HeaderConfig header;
        boolean z11;
        ArrayList arrayList;
        String logoDarkUrl;
        i.e(teamPresence, "teamPresence");
        if (configModules == null) {
            HomeUiState.Content.ContentHeader.ColoredText coloredText = new HomeUiState.Content.ContentHeader.ColoredText("", 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null);
            HomeUiState.Content.ContentHeader.ColoredText coloredText2 = new HomeUiState.Content.ContentHeader.ColoredText("", 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null);
            int i10 = H.f13505m;
            return new HomeUiState.Content.ContentHeader(false, null, null, coloredText2, coloredText, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(H.f13495b, false, null), null, false, EmptyList.f42983b, new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 68, null);
        }
        HeaderBackdropType type = configModules.getHome().getHeader().getBackground().getType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            pair = new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = z10 ? new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor())) : new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
        }
        HomeUiState.Content.ContentHeader.ColoredText coloredText3 = (HomeUiState.Content.ContentHeader.ColoredText) pair.a();
        HomeUiState.Content.ContentHeader.ColoredText coloredText4 = (HomeUiState.Content.ContentHeader.ColoredText) pair.b();
        int i12 = iArr[configModules.getHome().getHeader().getBackground().getType().ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (z10) {
                closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText3.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
            } else {
                closeButtonColor2 = new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", configModules.getCustomization().getHeader().getForegroundColor(), coloredText3.getTextColorDark(), 0.5f);
            }
            header = configModules.getHome().getHeader();
            if (n.S(header.getContent().getLogoUrl()) || !((logoDarkUrl = header.getContent().getLogoDarkUrl()) == null || n.S(logoDarkUrl))) {
                z11 = true;
            } else {
                z11 = false;
            }
            String logoUrl = header.getContent().getLogoUrl();
            String logoDarkUrl2 = header.getContent().getLogoDarkUrl();
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM290getHeaderBackdropStylebw27NRU = m290getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM290getHeaderBackdropStylebw27NRU2 = m290getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
            boolean showAvatars = header.getContent().getShowAvatars();
            List<Participant> listI0 = q.i0(teamPresence.getBuiltActiveAdmins(), 3);
            arrayList = new ArrayList(m.y(listI0, 10));
            for (Participant participant : listI0) {
                Avatar avatar = participant.getAvatar();
                i.d(avatar, "getAvatar(...)");
                Boolean boolIsBot = participant.isBot();
                i.d(boolIsBot, "isBot(...)");
                arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
            }
            return new HomeUiState.Content.ContentHeader(z11, logoUrl, logoDarkUrl2, coloredText4, coloredText3, headerBackdropStyleM290getHeaderBackdropStylebw27NRU, headerBackdropStyleM290getHeaderBackdropStylebw27NRU2, showAvatars, arrayList, closeButtonColor2);
        }
        closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText3.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
        closeButtonColor2 = closeButtonColor;
        header = configModules.getHome().getHeader();
        if (n.S(header.getContent().getLogoUrl())) {
            z11 = true;
        } else {
            z11 = true;
        }
        String logoUrl2 = header.getContent().getLogoUrl();
        String logoDarkUrl3 = header.getContent().getLogoDarkUrl();
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM290getHeaderBackdropStylebw27NRU3 = m290getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyleM290getHeaderBackdropStylebw27NRU4 = m290getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
        boolean showAvatars2 = header.getContent().getShowAvatars();
        List<Participant> listI1 = q.i0(teamPresence.getBuiltActiveAdmins(), 3);
        arrayList = new ArrayList(m.y(listI1, 10));
        while (r0.hasNext()) {
            Avatar avatar2 = participant.getAvatar();
            i.d(avatar2, "getAvatar(...)");
            Boolean boolIsBot2 = participant.isBot();
            i.d(boolIsBot2, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar2, boolIsBot2.booleanValue()));
        }
        return new HomeUiState.Content.ContentHeader(z11, logoUrl2, logoDarkUrl3, coloredText4, coloredText3, headerBackdropStyleM290getHeaderBackdropStylebw27NRU3, headerBackdropStyleM290getHeaderBackdropStylebw27NRU4, showAvatars2, arrayList, closeButtonColor2);
    }

    public static final HomeUiState.Error.ErrorHeader computeErrorHeader(ConfigModules configModules) {
        if (configModules == null) {
            return new HomeUiState.Error.ErrorHeader("#000000", "#FFFFFF");
        }
        return new HomeUiState.Error.ErrorHeader(configModules.getCustomization().getHeader().getBackgroundColor(), configModules.getCustomization().getHeader().getForegroundColor());
    }

    /* JADX INFO: renamed from: getHeaderBackdropStyle-bw27NRU, reason: not valid java name */
    public static final HomeUiState.Content.ContentHeader.HeaderBackdropStyle m290getHeaderBackdropStylebw27NRU(HeaderBackgroundModel headerBackgroundModel, long j, boolean z10) {
        HeaderBackdropType type;
        List listS;
        ArrayList arrayList;
        String str;
        String imageDarkUrl;
        Boolean fadeToDark;
        i.e(headerBackgroundModel, "headerBackgroundModel");
        if (!z10 || (type = headerBackgroundModel.getTypeDark()) == null) {
            type = headerBackgroundModel.getType();
        }
        boolean fade = (!z10 || (fadeToDark = headerBackgroundModel.getFadeToDark()) == null) ? headerBackgroundModel.getFade() : fadeToDark.booleanValue();
        boolean z11 = fade;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[type.ordinal()];
        if (i10 == 1) {
            if (z10) {
                String colorDark = headerBackgroundModel.getColorDark();
                if (colorDark != null) {
                    j = d.d(ColorUtils.parseColor(colorDark));
                } else {
                    int i11 = iArr[headerBackgroundModel.getType().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        j = d.d(ColorUtils.parseColor(headerBackgroundModel.getColor()));
                    } else if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                j = d.d(ColorUtils.parseColor(headerBackgroundModel.getColor()));
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(j, z11, null);
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z10 || (imageDarkUrl = headerBackgroundModel.getImageDarkUrl()) == null) {
                String imageUrl = headerBackgroundModel.getImageUrl();
                str = imageUrl;
            } else {
                str = imageDarkUrl;
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image(j, str, z11, null);
        }
        if (z10) {
            List<String> gradientDark = headerBackgroundModel.getGradientDark();
            if (gradientDark != null) {
                List<String> list = gradientDark;
                listS = new ArrayList(m.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listS.add(new H(d.d(ColorUtils.parseColor((String) it.next()))));
                }
            } else {
                List<String> gradient = headerBackgroundModel.getGradient();
                if (gradient != null) {
                    List<String> list2 = gradient;
                    arrayList = new ArrayList(m.y(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new H(d.d(ColorUtils.parseColor((String) it2.next()))));
                    }
                    listS = arrayList;
                } else {
                    listS = l.s(new H(j), new H(j));
                }
            }
        } else {
            List<String> gradient2 = headerBackgroundModel.getGradient();
            if (gradient2 != null) {
                List<String> list3 = gradient2;
                arrayList = new ArrayList(m.y(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new H(d.d(ColorUtils.parseColor((String) it3.next()))));
                }
                listS = arrayList;
            } else {
                listS = l.s(new H(j), new H(j));
            }
        }
        return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(listS, z11);
    }
}
