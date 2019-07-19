// Below code is remove objects from parentobject after iterating based on condition
public List<Group> getOtherGroups(String userid) {
			// method 1
			List<Group> allgroupList = groupRepository.findAll();
			List<String> usergroupList = new ArrayList<>();
			
			usergroupList = userRepository.findGroupsById(userid);
			if (CollectionUtils.isNotEmpty(usergroupList)) {
				for (String usergroup : usergroupList) {
					Iterator<Group> iterator = allgroupList.iterator();
					while (iterator.hasNext()) {
						Group group = iterator.next();
						if (group.getId().equals(usergroup)) {
							iterator.remove();
						}

					}
				}
			}
			return allgroupList;
		
		}*/
		
	public List<Group> tryjavaeight(String userid) {
  // method 2
		List<Group> allgroupList = groupRepository.findAll();
		final List<String> usergroupList = userRepository.findGroupsById(userid);
		List<Group> othergroupList = new ArrayList<Group>();
		allgroupList.forEach(g -> {
			usergroupList.forEach(h -> {
				if (h.equals(g.getId())) {
					othergroupList.add(g);
				}
			});
		});

		allgroupList.removeAll(othergroupList);
		return allgroupList;
	}
		
	
	@Override
	public List<Group> getOtherGroups(String userid) {
		try {
			List<Group> allgroupList = groupRepository.findAll();
			List<String> usergroupList = userRepository.findGroupsById(userid);
			if (!allgroupList.isEmpty() && !usergroupList.isEmpty()) {
				allgroupList.removeIf((Group pp) -> {
					return usergroupList.stream().anyMatch(x -> (pp.getId().equals(x)));
				});
				return allgroupList;
			}else {
				return new ArrayList<Group>();
			}
		} catch (Exception ex) {
			throw new EntityNotFoundException(UserMessage.USER_NOT_FOUND.getMessage());
		}

	}
