package me.gogosing.board.adapter.in.web.response.converter;

import java.util.Optional;
import me.gogosing.board.adapter.in.web.response.GetBoardArticleItemWebResponse;
import me.gogosing.board.application.port.in.response.GetBoardArticleItemInResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class GetBoardArticleItemWebResponseConverter implements Converter<GetBoardArticleItemInResponse, GetBoardArticleItemWebResponse> {

	@Override
	public GetBoardArticleItemWebResponse convert(final @Nullable GetBoardArticleItemInResponse source) {
		return Optional.ofNullable(source)
			.map(inResponse -> GetBoardArticleItemWebResponse.builder()
				.id(inResponse.getId())
				.title(inResponse.getTitle())
				.category(inResponse.getCategory())
				.createDate(inResponse.getCreateDate())
				.updateDate(inResponse.getUpdateDate())
				.build())
			.orElse(null);
	}
}
