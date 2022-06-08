package me.gogosing.board.adapter.in.web.response;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import me.gogosing.support.code.board.BoardCategory;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetBoardArticleItemWebResponse {

	private final Long id;

	private final String title;

	private final BoardCategory category;

	private final LocalDateTime createDate;

	private final LocalDateTime updateDate;
}
